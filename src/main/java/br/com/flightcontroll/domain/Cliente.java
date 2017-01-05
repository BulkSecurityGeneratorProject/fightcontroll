package br.com.flightcontroll.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Cliente.
 */
@Entity
@Table(name = "cliente")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "nome", nullable = false)
    private String nome;

    @NotNull
    @Size(max = 2)
    @Column(name = "tipo_pessoa", length = 2, nullable = false)
    private String tipoPessoa;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @NotNull
    @Column(name = "inscricao_estadual", nullable = false)
    private String inscricaoEstadual;

    @NotNull
    @Column(name = "endereco", nullable = false)
    private String endereco;

    @NotNull
    @Column(name = "numero", nullable = false)
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @NotNull
    @Column(name = "bairro", nullable = false)
    private String bairro;

    @NotNull
    @Column(name = "cep", nullable = false)
    private String cep;

    @NotNull
    @Column(name = "cidade", nullable = false)
    private String cidade;

    @NotNull
    @Column(name = "contato", nullable = false)
    private String contato;

    @NotNull
    @Column(name = "telefone_contato", nullable = false)
    private String telefoneContato;

    @NotNull
    @Column(name = "email_contato", nullable = false)
    private String emailContato;

    @Column(name = "contato_2")
    private String contato2;

    @Column(name = "email_contato_2")
    private String emailContato2;

    @Column(name = "telefone_contato_2")
    private String telefoneContato2;

    @NotNull
    @Column(name = "prefixo", nullable = false)
    private String prefixo;

    @NotNull
    @Column(name = "modelo", nullable = false)
    private String modelo;

    @NotNull
    @Column(name = "numero_de_serie", nullable = false)
    private String numeroDeSerie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Cliente nome(String nome) {
        this.nome = nome;
        return this;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public Cliente tipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
        return this;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public Cliente cpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
        return this;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public Cliente inscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        return this;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEndereco() {
        return endereco;
    }

    public Cliente endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente numero(String numero) {
        this.numero = numero;
        return this;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public Cliente complemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public Cliente bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public Cliente cep(String cep) {
        this.cep = cep;
        return this;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public Cliente cidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getContato() {
        return contato;
    }

    public Cliente contato(String contato) {
        this.contato = contato;
        return this;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public Cliente telefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
        return this;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public Cliente emailContato(String emailContato) {
        this.emailContato = emailContato;
        return this;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getContato2() {
        return contato2;
    }

    public Cliente contato2(String contato2) {
        this.contato2 = contato2;
        return this;
    }

    public void setContato2(String contato2) {
        this.contato2 = contato2;
    }

    public String getEmailContato2() {
        return emailContato2;
    }

    public Cliente emailContato2(String emailContato2) {
        this.emailContato2 = emailContato2;
        return this;
    }

    public void setEmailContato2(String emailContato2) {
        this.emailContato2 = emailContato2;
    }

    public String getTelefoneContato2() {
        return telefoneContato2;
    }

    public Cliente telefoneContato2(String telefoneContato2) {
        this.telefoneContato2 = telefoneContato2;
        return this;
    }

    public void setTelefoneContato2(String telefoneContato2) {
        this.telefoneContato2 = telefoneContato2;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public Cliente prefixo(String prefixo) {
        this.prefixo = prefixo;
        return this;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getModelo() {
        return modelo;
    }

    public Cliente modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public Cliente numeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        return this;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        if (cliente.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
            "id=" + id +
            ", nome='" + nome + "'" +
            ", tipoPessoa='" + tipoPessoa + "'" +
            ", cpfCnpj='" + cpfCnpj + "'" +
            ", inscricaoEstadual='" + inscricaoEstadual + "'" +
            ", endereco='" + endereco + "'" +
            ", numero='" + numero + "'" +
            ", complemento='" + complemento + "'" +
            ", bairro='" + bairro + "'" +
            ", cep='" + cep + "'" +
            ", cidade='" + cidade + "'" +
            ", contato='" + contato + "'" +
            ", telefoneContato='" + telefoneContato + "'" +
            ", emailContato='" + emailContato + "'" +
            ", contato2='" + contato2 + "'" +
            ", emailContato2='" + emailContato2 + "'" +
            ", telefoneContato2='" + telefoneContato2 + "'" +
            ", prefixo='" + prefixo + "'" +
            ", modelo='" + modelo + "'" +
            ", numeroDeSerie='" + numeroDeSerie + "'" +
            '}';
    }
}
