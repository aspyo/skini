package capstone.skini.domain.diagnosis.dto;

import capstone.skini.domain.diagnosis.entity.Diagnosis;
import capstone.skini.domain.diagnosis.entity.DiagnosisType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DiagnosisDto {
    private String username;
    private DiagnosisType diagnosisType;
    private String result;
    private Integer confidenceScore;

    public DiagnosisDto(Diagnosis diagnosis) {
        username = diagnosis.getUser().getUsername();
        diagnosisType = diagnosis.getDiagnosisType();
        result = diagnosis.getResult();
        confidenceScore = diagnosis.getConfidenceScore();
    }
}
