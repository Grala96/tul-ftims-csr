package pl.lodz.p.edu.csr.textclassification.service.extractors;

import org.junit.jupiter.api.Test;
import pl.lodz.p.edu.csr.textclassification.service.utils.TextProcessor;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AmountWordsBetweenUniqueKeywordsTest {

    Extractor awbuk = new AmountKeywordsOnParagraph(new TextProcessor());

    String text = "Sun dog cat cat sun moon. Test dance dance. Test cow glass test cow.";

    AmountWordsBetweenUniqueKeywordsTest() throws IOException {
    }

    @Test
    void extract() {
    }
}