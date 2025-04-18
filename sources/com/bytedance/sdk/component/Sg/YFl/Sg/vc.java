package com.bytedance.sdk.component.Sg.YFl.Sg;

/* loaded from: classes.dex */
final class vc {
    static long Sg;
    static wN YFl;

    private vc() {
    }

    public static wN YFl() {
        synchronized (vc.class) {
            wN wNVar = YFl;
            if (wNVar != null) {
                YFl = wNVar.f10333vc;
                wNVar.f10333vc = null;
                Sg -= 8192;
                return wNVar;
            }
            return new wN();
        }
    }

    public static void YFl(wN wNVar) {
        if (wNVar.f10333vc == null && wNVar.DSW == null) {
            if (wNVar.AlY) {
                return;
            }
            synchronized (vc.class) {
                long j3 = Sg;
                if (j3 + 8192 > 65536) {
                    return;
                }
                Sg = j3 + 8192;
                wNVar.f10333vc = YFl;
                wNVar.tN = 0;
                wNVar.Sg = 0;
                YFl = wNVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
