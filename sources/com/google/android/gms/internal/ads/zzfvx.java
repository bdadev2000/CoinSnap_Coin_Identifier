package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfvx {
    private static final zzfvv zza = new zzfvv("PhoneskyVerificationUtils");

    public static boolean zza(Context context) {
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                zza.zzd("Play Store package is disabled.", new Object[0]);
            } else {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr != null && (signatureArr.length) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String zza2 = zzfvw.zza(signature.toByteArray());
                            arrayList.add(zza2);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(zza2) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(zza2))) {
                                return true;
                            }
                        }
                        zzfvv zzfvvVar = zza;
                        Object[] objArr = new Object[1];
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb2.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb2.append((CharSequence) ", ");
                            }
                        }
                        objArr[0] = sb2.toString();
                        zzfvvVar.zzd(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new Object[0]);
                    } else {
                        zza.zzd("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zza.zzd("Play Store package is not found.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            zza.zzd("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
