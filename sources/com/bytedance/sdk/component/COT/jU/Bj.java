package com.bytedance.sdk.component.COT.jU;

import com.google.android.gms.location.GeofenceStatusCodes;

/* loaded from: classes.dex */
public class Bj extends zp {
    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(final com.bytedance.sdk.component.COT.KS.KS ks) {
        final com.bytedance.sdk.component.COT.KS.HWF pvr = ks.pvr();
        com.bytedance.sdk.component.COT.jU jU = pvr.jU();
        ks.zp(false);
        try {
            com.bytedance.sdk.component.COT.HWF zp = jU.zp(new com.bytedance.sdk.component.COT.lMd.KS(ks.zp(), ks.tG(), ks.rV(), ks.ot()));
            int lMd = zp.lMd();
            ks.zp(zp.zp());
            if (zp.lMd() == 200) {
                final byte[] bArr = (byte[]) zp.KS();
                ks.zp(new lMd(bArr, zp));
                final String dT = ks.dT();
                final com.bytedance.sdk.component.COT.lMd cz = ks.cz();
                if (cz.KS()) {
                    pvr.lMd(ks.cz()).zp(dT, bArr);
                }
                pvr.HWF().submit(new Runnable() { // from class: com.bytedance.sdk.component.COT.jU.Bj.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (cz.jU()) {
                            pvr.KS(ks.cz()).zp(dT, bArr);
                        }
                    }
                });
                return;
            }
            pvr.ku();
            String.valueOf(zp);
            Object KS = zp.KS();
            zp(lMd, zp.jU(), KS instanceof Throwable ? (Throwable) KS : null, ks);
        } catch (Throwable th) {
            zp(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, "net request failed!", th, ks);
        }
    }

    private void zp(int i9, String str, Throwable th, com.bytedance.sdk.component.COT.KS.KS ks) {
        ks.zp(new ku(i9, str, th));
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "net_request";
    }
}
