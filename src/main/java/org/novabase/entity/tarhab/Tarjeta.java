package org.novabase.entity.tarhab;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.ResultSet;

@Entity
@Table(schema = "modtarhab", name = "tartbltarjet")
@Data
@NamedStoredProcedureQuery(
        name = "consultarTarjetasAbonos",
        procedureName = "MODWSONLINE2.PKG_CONSULTAS.CONSULTAR_TARJETAS_ABONOS",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_PK_ENT_CODIGO_EMP", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "P_PK_CAMPAN_CODIGO", type = Integer.class),
                @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "P_TARJETAS", type = ResultSet.class),
        }
)
public class Tarjeta {

    @Id
    @Column(name = "PK_TARJET_CODIGO")
    private Integer pkTarjetCodigo;

    @Column(name = "PK_TARTBLCUENTA_CODIGO")
    private Integer pkTartblcuentaCodigo;

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "PK_ESTTAR_CODIGO")
    private Integer pkEsttarCodigo;

    @Column(name = "FK_TARJETA_ID_ZEUS")
    private Integer fkTarjetaIdZeus;

    @Column(name = "IDENTIFICADOR")
    private Integer identificador;

}
