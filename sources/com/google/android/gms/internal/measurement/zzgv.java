package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import c4.C0607a;
import c4.c;
import c4.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import x.l;

/* loaded from: classes2.dex */
public final class zzgv {

    /* loaded from: classes2.dex */
    public static class zza {
        private static volatile c zza;

        private zza() {
        }

        public static c zza(Context context) {
            c zza2;
            c cVar = zza;
            if (cVar == null) {
                synchronized (zza.class) {
                    try {
                        cVar = zza;
                        if (cVar == null) {
                            new zzgv();
                            if (!zzgw.zza(Build.TYPE, Build.TAGS)) {
                                zza2 = C0607a.b;
                            } else {
                                if (zzgi.zza() && !context.isDeviceProtectedStorage()) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                                zza2 = zzgv.zza(context);
                            }
                            zza = zza2;
                            cVar = zza2;
                        }
                    } finally {
                    }
                }
            }
            return cVar;
        }
    }

    private static zzgt zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                l lVar = new l();
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
                            l lVar2 = (l) lVar.getOrDefault(zza2, null);
                            if (lVar2 == null) {
                                lVar2 = new l();
                                lVar.put(zza2, lVar2);
                            }
                            lVar2.put(decode, str);
                        }
                    } else {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzgo zzgoVar = new zzgo(lVar);
                        bufferedReader.close();
                        return zzgoVar;
                    }
                }
            } finally {
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static c zzb(Context context) {
        C0607a c0607a = C0607a.b;
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return new d(file);
            }
            return c0607a;
        } catch (RuntimeException e4) {
            Log.e("HermeticFileOverrides", "no data dir", e4);
            return c0607a;
        }
    }

    public static c zza(Context context) {
        c cVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            c zzb = zzb(context);
            if (zzb.b()) {
                zzgt zza2 = zza(context, (File) zzb.a());
                zza2.getClass();
                cVar = new d(zza2);
            } else {
                cVar = C0607a.b;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return cVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
