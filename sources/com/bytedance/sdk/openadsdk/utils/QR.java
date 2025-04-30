package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class QR {

    /* renamed from: com.bytedance.sdk.openadsdk.utils.QR$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements FilenameFilter {
        private final Pattern zp = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.zp.matcher(str).matches();
        }
    }

    public static int KS(Context context) {
        return com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("cpu_min_frequency", 0);
    }

    public static int lMd(Context context) {
        return com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("cpu_max_frequency", 0);
    }

    public static int zp() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    public static int lMd(int i9) {
        BufferedReader bufferedReader;
        Throwable th;
        int parseInt;
        int i10 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i9--;
            if (i9 < 0) {
                return i10;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i9 + "/cpufreq/cpuinfo_min_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String readLine = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(readLine) && ((parseInt = Integer.parseInt(readLine)) < i10 || i10 == 0)) {
                            i10 = parseInt;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.tG.zp("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            }
                            bufferedReader2 = bufferedReader;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th3;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader2;
                th = th4;
            }
        }
    }

    public static int zp(Context context) {
        return com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("cpu_count", 0);
    }

    public static int zp(int i9) {
        BufferedReader bufferedReader;
        Throwable th;
        int parseInt;
        int i10 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i9--;
            if (i9 < 0) {
                return i10;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i9 + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String readLine = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(readLine) && (parseInt = Integer.parseInt(readLine)) > i10) {
                            i10 = parseInt;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.tG.zp("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            }
                            bufferedReader2 = bufferedReader;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th3;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader2;
                th = th4;
            }
        }
    }
}
