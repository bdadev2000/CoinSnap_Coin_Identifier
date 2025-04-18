package com.bytedance.sdk.openadsdk.core.settings;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.wN;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class EH implements wN {
    private final String DSW;

    /* renamed from: nc, reason: collision with root package name */
    private YFl f10742nc;
    private final ConcurrentHashMap<String, Object> tN = new ConcurrentHashMap<>();
    private final Object AlY = new Object();
    private final Object wN = new Object();

    /* renamed from: vc, reason: collision with root package name */
    private final CountDownLatch f10743vc = new CountDownLatch(1);
    private Properties qsH = new Properties();
    private volatile boolean NjR = false;

    /* loaded from: classes.dex */
    public interface YFl {
        void Sg();

        void YFl();
    }

    public EH(String str, YFl yFl) {
        this.DSW = str;
        this.f10742nc = yFl;
        mn.YFl(new com.bytedance.sdk.component.qsH.qsH("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.EH.1
            @Override // java.lang.Runnable
            public void run() {
                EH.this.YFl(false);
            }
        });
    }

    private File vc() {
        return new File(lG.YFl().getFilesDir(), this.DSW);
    }

    private void wN() {
        int i10;
        if (!this.NjR) {
            try {
                SystemClock.elapsedRealtime();
                if (mn.wN()) {
                    i10 = 4;
                } else {
                    i10 = 8;
                }
                this.f10743vc.await(i10, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("SdkSettings.Prop", "awaitLoadedLocked: ", e2);
            }
        }
    }

    public void AlY() {
        YFl yFl = this.f10742nc;
        if (yFl != null) {
            yFl.Sg();
        }
    }

    public void tN() {
        File vc2 = vc();
        if (vc2.exists()) {
            vc2.delete();
        }
    }

    public boolean Sg() {
        return this.NjR;
    }

    public String YFl(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        wN();
        return this.qsH.getProperty(str, str2);
    }

    public int YFl(String str, int i10) {
        if (str != null && !str.isEmpty()) {
            wN();
            try {
                return Integer.parseInt(this.qsH.getProperty(str, String.valueOf(i10)));
            } catch (NumberFormatException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("SdkSettings.Prop", "", e2);
            }
        }
        return i10;
    }

    public long YFl(String str, long j3) {
        if (str != null && !str.isEmpty()) {
            wN();
            try {
                return Long.parseLong(this.qsH.getProperty(str, String.valueOf(j3)));
            } catch (NumberFormatException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("SdkSettings.Prop", "", e2);
            }
        }
        return j3;
    }

    public float YFl(String str, float f10) {
        if (str != null && !str.isEmpty()) {
            wN();
            try {
                return Float.parseFloat(this.qsH.getProperty(str, String.valueOf(f10)));
            } catch (NumberFormatException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("SdkSettings.Prop", "", e2);
            }
        }
        return f10;
    }

    /* loaded from: classes.dex */
    public class Sg implements wN.YFl {
        private final Map<String, Object> Sg = new HashMap();
        private final Object tN = new Object();

        public Sg() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.YFl
        public void YFl() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.tN) {
                properties.putAll(EH.this.qsH);
                boolean z10 = false;
                for (Map.Entry<String, Object> entry : this.Sg.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != this && value != null) {
                        if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z10 = true;
                        }
                    }
                    if (properties.containsKey(key)) {
                        properties.remove(key);
                        z10 = true;
                    }
                }
                this.Sg.clear();
                if (z10) {
                    EH.this.YFl(properties);
                    EH.this.qsH = properties;
                    EH.this.tN.clear();
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.YFl
        public wN.YFl YFl(String str, String str2) {
            synchronized (this.tN) {
                this.Sg.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.YFl
        public wN.YFl YFl(String str, int i10) {
            synchronized (this.tN) {
                this.Sg.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.YFl
        public wN.YFl YFl(String str, long j3) {
            synchronized (this.tN) {
                this.Sg.put(str, Long.valueOf(j3));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.YFl
        public wN.YFl YFl(String str) {
            synchronized (this.tN) {
                this.Sg.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.YFl
        public wN.YFl YFl(String str, float f10) {
            synchronized (this.tN) {
                this.Sg.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.wN.YFl
        public wN.YFl YFl(String str, boolean z10) {
            synchronized (this.tN) {
                this.Sg.put(str, Boolean.valueOf(z10));
            }
            return this;
        }
    }

    public boolean YFl(String str, boolean z10) {
        if (str != null && !str.isEmpty()) {
            wN();
            try {
                return Boolean.parseBoolean(this.qsH.getProperty(str, String.valueOf(z10)));
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("SdkSettings.Prop", "", e2);
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8 A[Catch: all -> 0x0108, TryCatch #3 {, blocks: (B:4:0x0003, B:7:0x0009, B:10:0x000b, B:12:0x0016, B:22:0x0042, B:23:0x0047, B:24:0x00f4, B:26:0x00f8, B:28:0x00fc, B:29:0x00ff, B:30:0x0106, B:45:0x005b, B:46:0x005e, B:49:0x0079, B:50:0x007c, B:51:0x0081, B:36:0x0071, B:37:0x0074, B:54:0x0082, B:56:0x008c, B:59:0x0096, B:61:0x00ab, B:62:0x00bb, B:64:0x00c1, B:67:0x00d3, B:72:0x00db, B:80:0x00e6, B:81:0x00e9, B:43:0x0052, B:40:0x0068, B:34:0x0063), top: B:3:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(boolean r9) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.EH.YFl(boolean):void");
    }

    public wN.YFl YFl() {
        return new Sg();
    }

    public <T> T YFl(String str, T t5, wN.Sg<T> sg2) {
        T Sg2;
        if (str != null && !str.isEmpty()) {
            if (this.tN.containsKey(str)) {
                try {
                    return (T) this.tN.get(str);
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("SdkSettings.Prop", "", e2);
                    return t5;
                }
            }
            wN();
            String property = this.qsH.getProperty(str, null);
            if (property != null && sg2 != null && (Sg2 = sg2.Sg(property)) != null) {
                this.tN.put(str, Sg2);
                return Sg2;
            }
        }
        return t5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(Properties properties) {
        synchronized (this.wN) {
            File vc2 = vc();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(vc2);
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        vc2.getAbsolutePath();
                        com.bytedance.sdk.openadsdk.utils.nc.YFl(fileOutputStream2);
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        com.bytedance.sdk.component.utils.YoT.YFl("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.nc.YFl(fileOutputStream);
                        }
                        rkt.wqc();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            com.bytedance.sdk.openadsdk.utils.nc.YFl(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        rkt.wqc();
    }
}
