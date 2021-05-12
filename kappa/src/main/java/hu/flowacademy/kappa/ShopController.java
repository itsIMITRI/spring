package hu.flowacademy.kappa;

import hu.flowacademy.kappa.responses.Shop;
import hu.flowacademy.kappa.responses.ShopModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
public class ShopController {
    @GetMapping("/api/v1/shop")
  public List<Shop> getAllShop(){
        var x = new Shop();
        x.setName("Flow");
        x.setId("123");
        return List.of(x);
    }

    @GetMapping("/api/shop/{id}")
    public ResponseEntity<Shop> getAllShopId(@PathVariable int id){
        if(id==10){
            return ResponseEntity.ok(new Shop());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/api/shop")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Shop> postShop(@RequestBody ShopModel model){
        return ResponseEntity.noContent().build();
    }
}
