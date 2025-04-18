package com.facebook.ads.redexgen.uinode;

import android.content.DialogInterface;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class UZ extends KT {
    public static String[] A02 = {CampaignEx.JSON_KEY_AD_R, "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ M1 A01;

    public UZ(M1 m12, DialogInterface dialogInterface) {
        this.A01 = m12;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        RK rk;
        RK rk2;
        C1069Ym c1069Ym;
        Map<? extends String, ? extends String> A022;
        rk = this.A01.A01.A02;
        if (rk != null) {
            rk2 = this.A01.A01.A02;
            c1069Ym = this.A01.A01.A00;
            String A03 = K9.A03(c1069Ym);
            RY ry = new RY();
            A022 = this.A01.A01.A02(this.A01.A00.getText().toString());
            rk2.ADz(A03, ry.A05(A022).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
