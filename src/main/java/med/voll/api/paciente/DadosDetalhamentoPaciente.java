package med.voll.api.paciente;

public record DadosDetalhamentoPaciente(Long id, String nome, String cpf, String email, String telefone) {
    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getCpf(), paciente.getEmail(), paciente.getTelefone());
    }

}
