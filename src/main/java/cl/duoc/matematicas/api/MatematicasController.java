package cl.duoc.matematicas.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping
public class MatematicasController {
    private static final Logger log = LoggerFactory.getLogger(MatematicasController.class);

    @GetMapping("/api/suma/{num1}/{num2}")
    public ResponseEntity<Integer> suma(
            @PathVariable("num1") int numero1,
            @PathVariable("num2") int numero2) {
        return new ResponseEntity<>( numero1 + numero2, HttpStatus.OK);
    }

    @GetMapping("/api/resta/{num1}/{num2}")
    public ResponseEntity<Integer> resta(
            @PathVariable int num1,
            @PathVariable int num2) {
        return new ResponseEntity<>( num1 - num2, HttpStatus.OK);
    }

    @GetMapping("/api/multiplicacion/{num1}/{num2}")
    public ResponseEntity<Integer> multiplicacion(
            @PathVariable int num1,
            @PathVariable int num2) {
        return new ResponseEntity<>( num1 * num2, HttpStatus.OK);
    }

    @GetMapping("/api/division/{num1}/{num2}")
    public ResponseEntity<Integer> division(
            @PathVariable int num1,
            @PathVariable int num2) {
        return new ResponseEntity<>( num1 / num2, HttpStatus.OK);
    }
}
