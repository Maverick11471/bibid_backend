package bibid.service.auction;

import bibid.dto.AuctionDetailDto;
import bibid.dto.AuctionDto;
import bibid.entity.Auction;
import bibid.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AuctionService {
    Page<AuctionDto> post(AuctionDto auctionDto, AuctionDetailDto auctionDetailDto, MultipartFile thumbnail, MultipartFile[] additionalImages, Member member, Pageable pageable);

}