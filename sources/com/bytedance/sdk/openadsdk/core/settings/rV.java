package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.jU;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public abstract class rV implements jU {
    private final String YW;
    private zp dT;
    private final ConcurrentHashMap<String, Object> KS = new ConcurrentHashMap<>();
    private final Object jU = new Object();
    private final Object COT = new Object();
    private final CountDownLatch HWF = new CountDownLatch(1);
    private Properties QR = new Properties();
    private volatile boolean ku = false;

    /* loaded from: classes.dex */
    public interface zp {
        void zp();
    }

    public rV(String str, zp zpVar) {
        this.YW = str;
        this.dT = zpVar;
        QUv.zp(new com.bytedance.sdk.component.ku.ku("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.rV.1
            @Override // java.lang.Runnable
            public void run() {
                rV.this.zp(false);
            }
        });
    }

    private File COT() {
        return new File(KVG.zp().getFilesDir(), this.YW);
    }

    private void jU() {
        while (!this.ku) {
            try {
                this.HWF.await();
            } catch (InterruptedException e4) {
                com.bytedance.sdk.component.utils.tG.zp("SdkSettings.Prop", "awaitLoadedLocked: ", e4);
            }
        }
    }

    public void KS() {
        File COT = COT();
        if (COT.exists()) {
            COT.delete();
        }
    }

    public boolean lMd() {
        return this.ku;
    }

    public String zp(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        jU();
        return this.QR.getProperty(str, str2);
    }

    public int zp(String str, int i9) {
        if (TextUtils.isEmpty(str)) {
            return i9;
        }
        jU();
        try {
            return Integer.parseInt(this.QR.getProperty(str, String.valueOf(i9)));
        } catch (NumberFormatException e4) {
            com.bytedance.sdk.component.utils.tG.zp("SdkSettings.Prop", "", e4);
            return i9;
        }
    }

    public long zp(String str, long j7) {
        if (TextUtils.isEmpty(str)) {
            return j7;
        }
        jU();
        try {
            return Long.parseLong(this.QR.getProperty(str, String.valueOf(j7)));
        } catch (NumberFormatException e4) {
            com.bytedance.sdk.component.utils.tG.zp("SdkSettings.Prop", "", e4);
            return j7;
        }
    }

    public float zp(String str, float f9) {
        if (TextUtils.isEmpty(str)) {
            return f9;
        }
        jU();
        try {
            return Float.parseFloat(this.QR.getProperty(str, String.valueOf(f9)));
        } catch (NumberFormatException e4) {
            com.bytedance.sdk.component.utils.tG.zp("SdkSettings.Prop", "", e4);
            return f9;
        }
    }

    /* loaded from: classes.dex */
    public class lMd implements jU.zp {
        private final Map<String, Object> lMd = new HashMap();
        private final Object KS = new Object();

        public lMd() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.zp
        public void zp() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.KS) {
                try {
                    properties.putAll(rV.this.QR);
                    boolean z8 = false;
                    for (Map.Entry<String, Object> entry : this.lMd.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (properties.containsKey(key) && (obj = properties.get(key)) != null && obj.equals(value)) {
                            }
                            properties.put(key, String.valueOf(value));
                            z8 = true;
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z8 = true;
                        }
                    }
                    this.lMd.clear();
                    if (z8) {
                        rV.this.zp(properties);
                        rV.this.QR = properties;
                        rV.this.KS.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.zp
        public jU.zp zp(String str, String str2) {
            synchronized (this.KS) {
                this.lMd.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.zp
        public jU.zp zp(String str, int i9) {
            synchronized (this.KS) {
                this.lMd.put(str, Integer.valueOf(i9));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.zp
        public jU.zp zp(String str, long j7) {
            synchronized (this.KS) {
                this.lMd.put(str, Long.valueOf(j7));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.zp
        public jU.zp zp(String str) {
            synchronized (this.KS) {
                this.lMd.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.zp
        public jU.zp zp(String str, float f9) {
            synchronized (this.KS) {
                this.lMd.put(str, Float.valueOf(f9));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.jU.zp
        public jU.zp zp(String str, boolean z8) {
            synchronized (this.KS) {
                this.lMd.put(str, Boolean.valueOf(z8));
            }
            return this;
        }
    }

    public boolean zp(String str, boolean z8) {
        if (TextUtils.isEmpty(str)) {
            return z8;
        }
        jU();
        try {
            return Boolean.parseBoolean(this.QR.getProperty(str, String.valueOf(z8)));
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("SdkSettings.Prop", "", e4);
            return z8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00fa A[Catch: all -> 0x000b, TryCatch #6 {all -> 0x000b, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x000e, B:12:0x0019, B:22:0x0049, B:23:0x004e, B:24:0x00f6, B:26:0x00fa, B:28:0x00fe, B:29:0x0101, B:30:0x0108, B:45:0x005f, B:46:0x0062, B:49:0x007d, B:50:0x0080, B:51:0x0085, B:36:0x0075, B:37:0x0078, B:54:0x0086, B:56:0x0090, B:59:0x009a, B:61:0x00af, B:62:0x00bf, B:64:0x00c5, B:69:0x00dd, B:76:0x00e8, B:77:0x00eb, B:43:0x0056, B:40:0x006c, B:34:0x0067), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(boolean r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.rV.zp(boolean):void");
    }

    public jU.zp zp() {
        return new lMd();
    }

    public <T> T zp(String str, T t9, jU.lMd<T> lmd) {
        T lMd2;
        if (TextUtils.isEmpty(str)) {
            return t9;
        }
        if (this.KS.containsKey(str)) {
            try {
                return (T) this.KS.get(str);
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("SdkSettings.Prop", "", e4);
                return t9;
            }
        }
        jU();
        String property = this.QR.getProperty(str, null);
        if (property == null || lmd == null || (lMd2 = lmd.lMd(property)) == null) {
            return t9;
        }
        this.KS.put(str, lMd2);
        return lMd2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(Properties properties) {
        synchronized (this.COT) {
            File COT = COT();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(COT);
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        COT.getAbsolutePath();
                        com.bytedance.sdk.openadsdk.utils.dT.zp(fileOutputStream2);
                    } catch (Exception e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        com.bytedance.sdk.component.utils.tG.zp("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.dT.zp(fileOutputStream);
                        }
                        dQp.hRp();
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.dT.zp(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }
        dQp.hRp();
    }
}
