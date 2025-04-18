package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import r.k;
import ra.a;
import ra.i;
import ra.l;

/* loaded from: classes3.dex */
public final class zzhg {

    /* loaded from: classes3.dex */
    public static class zza {
        private static volatile i zza;

        private zza() {
        }

        public static i zza(Context context) {
            i zza2;
            i iVar = zza;
            if (iVar == null) {
                synchronized (zza.class) {
                    iVar = zza;
                    if (iVar == null) {
                        new zzhg();
                        if (!zzhk.zza(Build.TYPE, Build.TAGS)) {
                            zza2 = a.f24044b;
                        } else {
                            if (zzgs.zza() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            zza2 = zzhg.zza(context);
                        }
                        zza = zza2;
                        iVar = zza2;
                    }
                }
            }
            return iVar;
        }
    }

    private static zzhh zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                k kVar = new k();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" ", 3);
                        if (split.length != 3) {
                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                        } else {
                            String zza2 = zza(split[0]);
                            String decode = Uri.decode(zza(split[1]));
                            String str = (String) hashMap.get(split[2]);
                            if (str == null) {
                                String zza3 = zza(split[2]);
                                str = Uri.decode(zza3);
                                if (str.length() < 1024 || str == zza3) {
                                    hashMap.put(zza3, str);
                                }
                            }
                            k kVar2 = (k) kVar.getOrDefault(zza2, null);
                            if (kVar2 == null) {
                                kVar2 = new k();
                                kVar.put(zza2, kVar2);
                            }
                            kVar2.put(decode, str);
                        }
                    } else {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzgy zzgyVar = new zzgy(kVar);
                        bufferedReader.close();
                        return zzgyVar;
                    }
                }
            } finally {
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static i zzb(Context context) {
        a aVar = a.f24044b;
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return new l(file);
            }
            return aVar;
        } catch (RuntimeException e2) {
            Log.e("HermeticFileOverrides", "no data dir", e2);
            return aVar;
        }
    }

    public static i zza(Context context) {
        i iVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            i zzb = zzb(context);
            if (zzb.b()) {
                zzhh zza2 = zza(context, (File) zzb.a());
                zza2.getClass();
                iVar = new l(zza2);
            } else {
                iVar = a.f24044b;
            }
            return iVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
