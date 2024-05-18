package Gwp.KNUMarket.domain.request.application;

import Gwp.KNUMarket.domain.request.data.dto.res.RequestGetRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface RequestService {
    ResponseEntity<HttpStatus> post(Integer productId, Authentication authentication);
    ResponseEntity<List<RequestGetRes>> get(Integer productId);
}