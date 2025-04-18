package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1113az implements InterfaceC02633w {
    public static String[] A02 = {"BxeCSXrFaRj", "IWeOsMGsO3rBvyiTuJXWjMqB2n5POdot", "NGgDVvJhpCyddRCxf5O6", "v7dseD2N", "b08ux26", "fg5WsruxE6pK3fVhNLQH97P2VsWOQFn1", "RDjE3tUyFXCJEzmAXOjq2W6VFZ2zcAes", "Fn45yaemrdjcOolPakoXMsDmphHClKxa"};
    public final /* synthetic */ FW A00;
    public final /* synthetic */ C02613u A01;

    public C1113az(FW fw, C02613u c02613u) {
        this.A00 = fw;
        this.A01 = c02613u;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02633w
    public final Object A4s(int i2) {
        C02593s compatInfo = this.A01.A00(i2);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02633w
    public final List<Object> A63(String str, int i2) {
        List<C02593s> A03 = this.A01.A03(str, i2);
        if (A03 != null) {
            ArrayList arrayList = new ArrayList();
            int size = A03.size();
            for (int i3 = 0; i3 < size; i3++) {
                C02593s c02593s = A03.get(i3);
                String[] strArr = A02;
                if (strArr[5].charAt(23) != strArr[1].charAt(23)) {
                    String[] strArr2 = A02;
                    strArr2[5] = "3GGS2FgfxS9PdCMsSIgMeheOLZnf3MlZ";
                    strArr2[1] = "aJbfA8b3NLiXQBSk9lndmf25pj9B4jE7";
                    arrayList.add(c02593s.A0M());
                }
            }
            return arrayList;
        }
        if (A02[0].length() == 11) {
            String[] strArr3 = A02;
            strArr3[5] = "atS9tmOPh4Y1RWGDtCP1b0ECIDkAYM0P";
            strArr3[1] = "WZrNDLg8WSJodQHinSBZlHZp62izmcoM";
            return null;
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02633w
    public final boolean AEQ(int i2, int i3, Bundle bundle) {
        return this.A01.A04(i2, i3, bundle);
    }
}
