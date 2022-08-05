package com.devcamp.pizza365.controller;

import com.devcamp.pizza365.model.CVoucher;
import com.devcamp.pizza365.repository.IVoucherRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/")
public class CVoucherController {
	@Autowired
	IVoucherRepository pVoucherRepository;

	@GetMapping("/vouchers")
	public ResponseEntity<List<CVoucher>> getAllVouchers() {
		try {
			List<CVoucher> pVouchers = new ArrayList<CVoucher>();

			pVoucherRepository.findAll().forEach(pVouchers::add);

			return new ResponseEntity<>(pVouchers, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/vouchers/{id}")
	public ResponseEntity<CVoucher> getCVoucherById(@PathVariable("id") long id) {
		Optional<CVoucher> voucherData = pVoucherRepository.findById(id);
		if (voucherData.isPresent()) {
			return new ResponseEntity<>(voucherData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/vouchers")
	public ResponseEntity<CVoucher> createCVoucher(@Valid @RequestBody CVoucher pVouchers) {
		try {
			pVouchers.setNgayTao(new Date());
			pVouchers.setNgayCapNhat(null);
			CVoucher _vouchers = pVoucherRepository.save(pVouchers);
			return new ResponseEntity<>(_vouchers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/vouchers/{id}")
	public ResponseEntity<CVoucher> updateCVoucherById(@PathVariable("id") long id, @RequestBody CVoucher pVouchers) {
		Optional<CVoucher> voucherData = pVoucherRepository.findById(id);
		if (voucherData.isPresent()) {
			CVoucher voucher= voucherData.get();
			voucher.setMaVoucher(pVouchers.getMaVoucher());
			voucher.setPhanTramGiamGia(pVouchers.getPhanTramGiamGia());
			voucher.setNgayCapNhat(new Date());
			return new ResponseEntity<>(pVoucherRepository.save(voucher), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/vouchers/{id}")
	public ResponseEntity<CVoucher> deleteCVoucherById(@PathVariable("id") long id) {
		try {
			pVoucherRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/vouchers")
	public ResponseEntity<CVoucher> deleteAllCVoucher() {
		try {
			pVoucherRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
