package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;

@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes3.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzb;
    private final Context zzc;
    private volatile String zzd;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.zzc = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzn.zze(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    public static final zzj zza(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < zzjVarArr.length; i10++) {
                if (zzjVarArr[i10].equals(zzkVar)) {
                    return zzjVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzb(@androidx.annotation.NonNull android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L28
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L2a
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = r4
        L2b:
            if (r4 == 0) goto L49
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L49
            if (r5 == 0) goto L3a
            com.google.android.gms.common.zzj[] r4 = com.google.android.gms.common.zzm.zza
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
            goto L46
        L3a:
            com.google.android.gms.common.zzj[] r4 = new com.google.android.gms.common.zzj[r0]
            com.google.android.gms.common.zzj[] r5 = com.google.android.gms.common.zzm.zza
            r5 = r5[r1]
            r4[r1] = r5
            com.google.android.gms.common.zzj r4 = zza(r2, r4)
        L46:
            if (r4 == 0) goto L49
            return r0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzx zzc(String str, boolean z10, boolean z11) {
        zzx zzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzx.zzc("null pkg");
        }
        if (!str.equals(this.zzd)) {
            if (zzn.zzg()) {
                zzc = zzn.zzb(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.zzc.getPackageManager().getPackageInfo(str, 64);
                    boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc);
                    if (packageInfo == null) {
                        zzc = zzx.zzc("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            zzx zza2 = zzn.zza(str2, zzkVar, honorsDebugCertificates, false);
                            if (zza2.zza && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && zzn.zza(str2, zzkVar, false, true).zza) {
                                zzc = zzx.zzc("debuggable release cert app rejected");
                            } else {
                                zzc = zza2;
                            }
                        } else {
                            zzc = zzx.zzc("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    return zzx.zzd("no pkg ".concat(str), e2);
                }
            }
            if (zzc.zza) {
                this.zzd = str;
            }
            return zzc;
        }
        return zzx.zzb();
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        zzx zzc = zzc(str, false, false);
        zzc.zze();
        return zzc.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i10) {
        zzx zzc;
        int length;
        String[] packagesForUid = this.zzc.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzc = null;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    zzc = zzc(packagesForUid[i11], false, false);
                    if (zzc.zza) {
                        break;
                    }
                    i11++;
                } else {
                    Preconditions.checkNotNull(zzc);
                    break;
                }
            }
        } else {
            zzc = zzx.zzc("no pkgs");
        }
        zzc.zze();
        return zzc.zza;
    }
}
