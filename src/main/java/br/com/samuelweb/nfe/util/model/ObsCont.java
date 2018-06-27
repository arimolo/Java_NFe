package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class ObsCont {

    @NfeCampo(id = "Z05", tag = "xCampo", tamanhoMinimo = 1, tamanhoMaximo = 20
            , ocorrencias = 1
            , descricao = NfeConsts.DSC_XCAMPO)
    private String xCampo;

    @NfeCampo(id = "Z06", tag = "xTexto", tamanhoMinimo = 1, tamanhoMaximo = 60
            , ocorrencias = 1, descricao = NfeConsts.DSC_XTEXTO)
    private String xTexto;

    public TNFe.InfNFe.InfAdic.ObsCont build() {
        TNFe.InfNFe.InfAdic.ObsCont obsCont = new TNFe.InfNFe.InfAdic.ObsCont();

        obsCont.setXCampo(this.getxCampo());
        obsCont.setXTexto(this.getxTexto());

        return obsCont;

    }

    public String getxCampo() {
        return xCampo;
    }

    public String getxTexto() {
        return xTexto;
    }

    public ObsCont setxCampo(String xCampo) {
        this.xCampo = xCampo;
        return this;
    }

    public ObsCont setxTexto(String xTexto) {
        this.xTexto = xTexto;
        return this;
    }
}