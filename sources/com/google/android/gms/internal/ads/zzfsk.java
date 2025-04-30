package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzfsk {
    public static boolean zza(zzazw zzazwVar) {
        zzazw zzazwVar2 = zzazw.UNSUPPORTED;
        int ordinal = zzazwVar.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return true;
        }
        return false;
    }

    public static final zzazw zzb(Context context, zzfre zzfreVar) {
        zzazw zzazwVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            zzfreVar.zzb(5017, "No lib/");
            zzazwVar = zzazw.UNKNOWN;
        } else {
            File[] listFiles = file.listFiles(new zzgdn(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    try {
                        bArr = new byte[20];
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    zzd(null, e4.toString(), context, zzfreVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzd(bArr, null, context, zzfreVar);
                        zzazwVar = zzazw.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s5 = ByteBuffer.wrap(bArr2).getShort();
                        if (s5 != 3) {
                            if (s5 != 40) {
                                if (s5 != 62) {
                                    if (s5 != 183) {
                                        if (s5 != 243) {
                                            zzd(bArr, null, context, zzfreVar);
                                            zzazwVar = zzazw.UNSUPPORTED;
                                        } else {
                                            zzazwVar = zzazw.RISCV64;
                                        }
                                    } else {
                                        zzazwVar = zzazw.ARM64;
                                    }
                                } else {
                                    zzazwVar = zzazw.X86_64;
                                }
                            } else {
                                zzazwVar = zzazw.ARM7;
                            }
                        } else {
                            zzazwVar = zzazw.X86;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzazwVar = zzazw.UNSUPPORTED;
                }
            } else {
                zzfreVar.zzb(5017, "No .so");
                zzazwVar = zzazw.UNKNOWN;
            }
        }
        if (zzazwVar == zzazw.UNKNOWN) {
            String zzc = zzc(context, zzfreVar);
            if (TextUtils.isEmpty(zzc)) {
                zzd(null, "Empty dev arch", context, zzfreVar);
                zzazwVar = zzazw.UNSUPPORTED;
            } else if (!zzc.equalsIgnoreCase("i686") && !zzc.equalsIgnoreCase("x86")) {
                if (zzc.equalsIgnoreCase("x86_64")) {
                    zzazwVar = zzazw.X86_64;
                } else if (zzc.equalsIgnoreCase("arm64-v8a")) {
                    zzazwVar = zzazw.ARM64;
                } else if (!zzc.equalsIgnoreCase("armeabi-v7a") && !zzc.equalsIgnoreCase("armv71")) {
                    if (zzc.equalsIgnoreCase("riscv64")) {
                        zzazwVar = zzazw.RISCV64;
                    } else {
                        zzd(null, zzc, context, zzfreVar);
                        zzazwVar = zzazw.UNSUPPORTED;
                    }
                } else {
                    zzazwVar = zzazw.ARM7;
                }
            } else {
                zzazwVar = zzazw.X86;
            }
        }
        zzfreVar.zzb(5018, zzazwVar.name());
        return zzazwVar;
    }

    private static final String zzc(Context context, zzfre zzfreVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfyu.OS_ARCH.zza();
        if (!TextUtils.isEmpty(zza) && hashSet.contains(zza)) {
            return zza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e4) {
            zzfreVar.zzc(2024, 0L, e4);
        } catch (NoSuchFieldException e9) {
            zzfreVar.zzc(2024, 0L, e9);
        }
        String str = Build.CPU_ABI;
        if (str != null) {
            return str;
        }
        return Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfre zzfreVar) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzfyu.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfreVar.zzb(4007, sb.toString());
    }
}
