package space.b2u.ScandiUM.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import space.b2u.ScandiUM.constants.API;
import space.b2u.ScandiUM.entity.Company;
import space.b2u.ScandiUM.entity.QueryResult;
import space.b2u.ScandiUM.exception.ResourceNotFoundException;
import space.b2u.ScandiUM.repository.CompanyRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(API.BASE_URL)
public class CompanyController {
    @Autowired
    private CompanyRepository repository;

    @GetMapping("/companies/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable Long id) {
        Company company = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Company not found by id:" + id));;
        return ResponseEntity.ok(company);
    }

    @GetMapping("/companies/inn/{inn}")
    public List<Company> getCompanyByInn(@PathVariable String inn) {
        return repository.findByInn(inn);
    }

    @GetMapping("/companies/name/{companyName}")
    public List<Company> getCompanyByName(@PathVariable String companyName) {
        return repository.findByNameContainingIgnoreCase(companyName);
    }

    @GetMapping("/companies/search/{param}")
    public QueryResult findCompany(@PathVariable String param){
        QueryResult queryResult = new QueryResult();
        queryResult.setResults(ListUtils.union(repository.findByInn(param), repository.findByNameContainingIgnoreCase(param)));
        return queryResult;
    }
}
