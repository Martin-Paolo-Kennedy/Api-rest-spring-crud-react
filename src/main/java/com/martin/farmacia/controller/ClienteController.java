package com.martin.farmacia.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.martin.farmacia.entity.Cliente;
import com.martin.farmacia.service.ClienteService;
import com.martin.farmacia.util.AppSettings;
import com.martin.farmacia.util.Constantes;

@RestController
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
@RequestMapping("/url/crudCliente")
public class ClienteController {
	@Autowired
	private ClienteService service;
	
	@GetMapping
    @ResponseBody
    public ResponseEntity<List<Cliente>> listaCliente() {
        List<Cliente> lista = service.listaTodos();
        return ResponseEntity.ok(lista);
    }
	
	@PostMapping("/registraCliente")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertaCliente(@RequestBody Cliente obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			obj.setId_cliente(0);
			Cliente objSalida =  service.InsertaCliente(obj);
			if (objSalida == null) {
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		}
		return ResponseEntity.ok(salida);
	}
	
	@PutMapping("/actualizaCliente")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> actualizaCliente(@RequestBody Cliente obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			Cliente objSalida =  service.ActualizaCliente(obj);
			if (objSalida == null) {
				salida.put("mensaje", Constantes.MENSAJE_ACT_ERROR);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_ACT_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_ACT_ERROR);
		}
		return ResponseEntity.ok(salida);
	}
	
	@DeleteMapping("/eliminaCliente/{id}")
	@ResponseBody
	public ResponseEntity<Map<String, Object>> eliminaCliente(@PathVariable("id") int idCliente) {
		Map<String, Object> salida = new HashMap<>();
		try {
			service.eliminaCliente(idCliente);
			salida.put("mensaje", Constantes.MENSAJE_ELI_EXITOSO);
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_ELI_ERROR);
		}
		return ResponseEntity.ok(salida);
	}
}
