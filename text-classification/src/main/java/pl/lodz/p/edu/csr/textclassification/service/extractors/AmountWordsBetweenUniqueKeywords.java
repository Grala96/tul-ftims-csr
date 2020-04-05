package pl.lodz.p.edu.csr.textclassification.service.extractors;

import org.springframework.beans.factory.annotation.Autowired;
import pl.lodz.p.edu.csr.textclassification.repository.entities.ReutersEntity;
import pl.lodz.p.edu.csr.textclassification.service.utils.TextProcessor;

public class AmountWordsBetweenUniqueKeywords implements Extractor{

    TextProcessor textProcessor;

    @Autowired
    AmountWordsBetweenUniqueKeywords(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public Double extract(ReutersEntity reuters) {
        return null;
    }
}
