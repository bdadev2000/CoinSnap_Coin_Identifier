package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class lMd {
    private static ArrayMap<String, File> Bj = null;
    private static zp tG = null;
    private static ArrayMap<File, lMd> vDp = null;
    private static boolean zp = false;
    private volatile boolean COT;
    private int HWF;
    private final Object KS;
    private long QR;
    private final File YW;
    private final File dT;
    private Properties jU;
    private long ku;
    private final Object lMd;

    /* renamed from: com.bytedance.sdk.component.lMd$lMd, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0089lMd {
        boolean COT;
        final CountDownLatch KS;
        volatile boolean jU;
        final Properties lMd;
        final long zp;

        public void zp(boolean z8, boolean z9) {
            this.COT = z8;
            this.jU = z9;
            this.KS.countDown();
        }

        private C0089lMd(long j7, Properties properties) {
            this.KS = new CountDownLatch(1);
            this.jU = false;
            this.COT = false;
            this.zp = j7;
            this.lMd = properties;
        }
    }

    /* loaded from: classes.dex */
    public interface zp {
        ExecutorService getExecutorService();
    }

    private lMd(File file) {
        Object obj = new Object();
        this.lMd = obj;
        this.KS = new Object();
        this.jU = new Properties();
        this.COT = false;
        this.HWF = 0;
        this.YW = file;
        this.dT = zp(file);
        synchronized (obj) {
            this.COT = false;
        }
        zp zpVar = tG;
        if (zpVar != null && zpVar.getExecutorService() != null) {
            tG.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.lMd.2
                @Override // java.lang.Runnable
                public void run() {
                    lMd.this.zp();
                }
            });
        } else {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.lMd.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    lMd.this.zp();
                }
            }.start();
        }
    }

    public static /* synthetic */ int COT(lMd lmd) {
        int i9 = lmd.HWF;
        lmd.HWF = i9 + 1;
        return i9;
    }

    public static /* synthetic */ long HWF(lMd lmd) {
        long j7 = lmd.QR;
        lmd.QR = 1 + j7;
        return j7;
    }

    public static /* synthetic */ int YW(lMd lmd) {
        int i9 = lmd.HWF;
        lmd.HWF = i9 - 1;
        return i9;
    }

    private void jU() {
        while (!this.COT) {
            try {
                this.lMd.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public KS lMd() {
        return new KS();
    }

    /* loaded from: classes.dex */
    public class KS implements SharedPreferences.Editor {
        private final Object lMd = new Object();
        private final Map<String, Object> KS = new HashMap();
        private boolean jU = false;

        public KS() {
        }

        private C0089lMd lMd() {
            Properties properties;
            long j7;
            Object obj;
            boolean z8;
            synchronized (lMd.this.lMd) {
                try {
                    if (lMd.this.HWF > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(lMd.this.jU);
                        lMd.this.jU = properties2;
                    }
                    properties = lMd.this.jU;
                    lMd.COT(lMd.this);
                    synchronized (this.lMd) {
                        try {
                            boolean z9 = false;
                            if (this.jU) {
                                if (!properties.isEmpty()) {
                                    properties.clear();
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                this.jU = false;
                                z9 = z8;
                            }
                            for (Map.Entry<String, Object> entry : this.KS.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value != this && value != null) {
                                    if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                        properties.put(key, String.valueOf(value));
                                        z9 = true;
                                    }
                                }
                                if (properties.containsKey(key)) {
                                    properties.remove(key);
                                    z9 = true;
                                }
                            }
                            this.KS.clear();
                            if (z9) {
                                lMd.HWF(lMd.this);
                            }
                            j7 = lMd.this.QR;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new C0089lMd(j7, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            lMd.this.zp(lMd(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long j7;
            if (lMd.zp) {
                j7 = System.currentTimeMillis();
            } else {
                j7 = 0;
            }
            C0089lMd lMd = lMd();
            lMd.this.zp(lMd, true);
            try {
                lMd.KS.await();
                if (lMd.zp) {
                    Log.d("TTPropHelper", lMd.this.YW.getName() + ":" + lMd.zp + " committed after " + (System.currentTimeMillis() - j7) + " ms");
                }
                return lMd.jU;
            } catch (InterruptedException unused) {
                if (lMd.zp) {
                    Log.d("TTPropHelper", lMd.this.YW.getName() + ":" + lMd.zp + " committed after " + (System.currentTimeMillis() - j7) + " ms");
                    return false;
                }
                return false;
            } catch (Throwable th) {
                if (lMd.zp) {
                    Log.d("TTPropHelper", lMd.this.YW.getName() + ":" + lMd.zp + " committed after " + (System.currentTimeMillis() - j7) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, @Nullable Set set) {
            return zp(str, (Set<String>) set);
        }

        public KS zp(String str, @Nullable Set<String> set) {
            synchronized (this.lMd) {
                this.KS.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public KS putInt(String str, int i9) {
            synchronized (this.lMd) {
                this.KS.put(str, Integer.valueOf(i9));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public KS putLong(String str, long j7) {
            synchronized (this.lMd) {
                this.KS.put(str, Long.valueOf(j7));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public KS putFloat(String str, float f9) {
            synchronized (this.lMd) {
                this.KS.put(str, Float.valueOf(f9));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public KS putString(String str, @Nullable String str2) {
            synchronized (this.lMd) {
                this.KS.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public KS putBoolean(String str, boolean z8) {
            synchronized (this.lMd) {
                this.KS.put(str, Boolean.valueOf(z8));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public KS remove(String str) {
            synchronized (this.lMd) {
                this.KS.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public KS clear() {
            synchronized (this.lMd) {
                this.jU = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128 A[Catch: all -> 0x012d, TryCatch #9 {all -> 0x012d, blocks: (B:38:0x0090, B:39:0x0092, B:103:0x019a, B:104:0x019b, B:55:0x0124, B:57:0x0128, B:58:0x0131, B:60:0x013a, B:61:0x0142, B:63:0x014e, B:71:0x00f6, B:72:0x00fc, B:54:0x0123, B:82:0x011c, B:96:0x0199, B:95:0x0190, B:53:0x00f0, B:78:0x0116, B:90:0x018a), top: B:37:0x0090, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a A[Catch: all -> 0x012d, TryCatch #9 {all -> 0x012d, blocks: (B:38:0x0090, B:39:0x0092, B:103:0x019a, B:104:0x019b, B:55:0x0124, B:57:0x0128, B:58:0x0131, B:60:0x013a, B:61:0x0142, B:63:0x014e, B:71:0x00f6, B:72:0x00fc, B:54:0x0123, B:82:0x011c, B:96:0x0199, B:95:0x0190, B:53:0x00f0, B:78:0x0116, B:90:0x018a), top: B:37:0x0090, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #9 {all -> 0x012d, blocks: (B:38:0x0090, B:39:0x0092, B:103:0x019a, B:104:0x019b, B:55:0x0124, B:57:0x0128, B:58:0x0131, B:60:0x013a, B:61:0x0142, B:63:0x014e, B:71:0x00f6, B:72:0x00fc, B:54:0x0123, B:82:0x011c, B:96:0x0199, B:95:0x0190, B:53:0x00f0, B:78:0x0116, B:90:0x018a), top: B:37:0x0090, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void lMd(com.bytedance.sdk.component.lMd.C0089lMd r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.lMd.lMd(com.bytedance.sdk.component.lMd$lMd, boolean):void");
    }

    public static void zp(zp zpVar) {
        tG = zpVar;
    }

    @RequiresApi(api = 19)
    public static lMd zp(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (lMd.class) {
            try {
                if (Bj == null) {
                    Bj = new ArrayMap<>();
                }
                File file = Bj.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    Bj.put(str, file);
                }
                if (vDp == null) {
                    vDp = new ArrayMap<>();
                }
                lMd lmd = vDp.get(file);
                if (lmd != null) {
                    return lmd;
                }
                lMd lmd2 = new lMd(file);
                vDp.put(file, lmd2);
                return lmd2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File zp(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00a1 -> B:30:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.lMd.zp():void");
    }

    public String zp(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.lMd) {
            jU();
            property = this.jU.getProperty(str, str2);
        }
        return property;
    }

    public int zp(String str, int i9) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return i9;
        }
        synchronized (this.lMd) {
            try {
                try {
                    jU();
                    parseInt = Integer.parseInt(this.jU.getProperty(str, String.valueOf(i9)));
                } catch (NumberFormatException e4) {
                    Log.e("TTPropHelper", e4.getMessage());
                    return i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseInt;
    }

    public long zp(String str, long j7) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            return j7;
        }
        synchronized (this.lMd) {
            try {
                try {
                    jU();
                    parseLong = Long.parseLong(this.jU.getProperty(str, String.valueOf(j7)));
                } catch (NumberFormatException e4) {
                    Log.e("TTPropHelper", e4.getMessage());
                    return j7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseLong;
    }

    public float zp(String str, float f9) {
        float parseFloat;
        if (TextUtils.isEmpty(str)) {
            return f9;
        }
        synchronized (this.lMd) {
            try {
                try {
                    jU();
                    parseFloat = Float.parseFloat(this.jU.getProperty(str, String.valueOf(f9)));
                } catch (NumberFormatException e4) {
                    Log.e("TTPropHelper", e4.getMessage());
                    return f9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseFloat;
    }

    public boolean zp(String str, boolean z8) {
        boolean parseBoolean;
        if (TextUtils.isEmpty(str)) {
            return z8;
        }
        synchronized (this.lMd) {
            try {
                try {
                    jU();
                    parseBoolean = Boolean.parseBoolean(this.jU.getProperty(str, String.valueOf(z8)));
                } catch (NumberFormatException e4) {
                    Log.e("TTPropHelper", e4.getMessage());
                    return z8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseBoolean;
    }

    public boolean zp(String str) {
        boolean containsKey;
        synchronized (this.lMd) {
            try {
                try {
                    jU();
                    containsKey = this.jU.containsKey(str);
                } catch (NumberFormatException e4) {
                    Log.e("TTPropHelper", e4.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return containsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final C0089lMd c0089lMd, final boolean z8) {
        boolean z9;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.lMd.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (lMd.this.KS) {
                    try {
                        lMd.this.lMd(c0089lMd, z8);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (lMd.this.lMd) {
                    lMd.YW(lMd.this);
                }
            }
        };
        if (z8) {
            synchronized (this.lMd) {
                z9 = this.HWF == 1;
            }
            if (z9) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.KS.zp(runnable, true ^ z8);
    }
}
