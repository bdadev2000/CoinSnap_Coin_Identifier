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
public class Sg {
    private static YFl GA = null;
    private static boolean YFl = false;
    private static ArrayMap<File, Sg> YoT;
    private static ArrayMap<String, File> eT;
    private Properties AlY;
    private long DSW;
    private final File NjR;
    private final Object Sg;

    /* renamed from: nc, reason: collision with root package name */
    private final File f10325nc;
    private long qsH;
    private final Object tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10326vc;
    private volatile boolean wN;

    /* renamed from: com.bytedance.sdk.component.Sg$Sg, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0078Sg {
        volatile boolean AlY;
        final Properties Sg;
        final long YFl;
        final CountDownLatch tN;
        boolean wN;

        public void YFl(boolean z10, boolean z11) {
            this.wN = z10;
            this.AlY = z11;
            this.tN.countDown();
        }

        private C0078Sg(long j3, Properties properties) {
            this.tN = new CountDownLatch(1);
            this.AlY = false;
            this.wN = false;
            this.YFl = j3;
            this.Sg = properties;
        }
    }

    /* loaded from: classes.dex */
    public interface YFl {
        ExecutorService getExecutorService();
    }

    private Sg(File file) {
        Object obj = new Object();
        this.Sg = obj;
        this.tN = new Object();
        this.AlY = new Properties();
        this.wN = false;
        this.f10326vc = 0;
        this.NjR = file;
        this.f10325nc = YFl(file);
        synchronized (obj) {
            this.wN = false;
        }
        YFl yFl = GA;
        if (yFl != null && yFl.getExecutorService() != null) {
            GA.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.Sg.2
                @Override // java.lang.Runnable
                public void run() {
                    Sg.this.YFl();
                }
            });
        } else {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.Sg.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Sg.this.YFl();
                }
            }.start();
        }
    }

    public static /* synthetic */ int NjR(Sg sg2) {
        int i10 = sg2.f10326vc;
        sg2.f10326vc = i10 - 1;
        return i10;
    }

    public static /* synthetic */ long vc(Sg sg2) {
        long j3 = sg2.DSW;
        sg2.DSW = 1 + j3;
        return j3;
    }

    public static /* synthetic */ int wN(Sg sg2) {
        int i10 = sg2.f10326vc;
        sg2.f10326vc = i10 + 1;
        return i10;
    }

    private void AlY() {
        while (!this.wN) {
            try {
                this.Sg.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public tN Sg() {
        return new tN();
    }

    /* loaded from: classes.dex */
    public class tN implements SharedPreferences.Editor {
        private final Object Sg = new Object();
        private final Map<String, Object> tN = new HashMap();
        private boolean AlY = false;

        public tN() {
        }

        private C0078Sg Sg() {
            Properties properties;
            long j3;
            Object obj;
            boolean z10;
            synchronized (Sg.this.Sg) {
                if (Sg.this.f10326vc > 0) {
                    Properties properties2 = new Properties();
                    properties2.putAll(Sg.this.AlY);
                    Sg.this.AlY = properties2;
                }
                properties = Sg.this.AlY;
                Sg.wN(Sg.this);
                synchronized (this.Sg) {
                    boolean z11 = false;
                    if (this.AlY) {
                        if (!properties.isEmpty()) {
                            properties.clear();
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.AlY = false;
                        z11 = z10;
                    }
                    for (Map.Entry<String, Object> entry : this.tN.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                properties.put(key, String.valueOf(value));
                                z11 = true;
                            }
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z11 = true;
                        }
                    }
                    this.tN.clear();
                    if (z11) {
                        Sg.vc(Sg.this);
                    }
                    j3 = Sg.this.DSW;
                }
            }
            return new C0078Sg(j3, properties);
        }

        public tN YFl(String str, @Nullable Set<String> set) {
            synchronized (this.Sg) {
                this.tN.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            Sg.this.YFl(Sg(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long j3;
            if (Sg.YFl) {
                j3 = System.currentTimeMillis();
            } else {
                j3 = 0;
            }
            C0078Sg Sg = Sg();
            Sg.this.YFl(Sg, true);
            try {
                Sg.tN.await();
                if (Sg.YFl) {
                    Log.d("TTPropHelper", Sg.this.NjR.getName() + ":" + Sg.YFl + " committed after " + (System.currentTimeMillis() - j3) + " ms");
                }
                return Sg.AlY;
            } catch (InterruptedException unused) {
                if (Sg.YFl) {
                    Log.d("TTPropHelper", Sg.this.NjR.getName() + ":" + Sg.YFl + " committed after " + (System.currentTimeMillis() - j3) + " ms");
                    return false;
                }
                return false;
            } catch (Throwable th2) {
                if (Sg.YFl) {
                    Log.d("TTPropHelper", Sg.this.NjR.getName() + ":" + Sg.YFl + " committed after " + (System.currentTimeMillis() - j3) + " ms");
                }
                throw th2;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, @Nullable Set set) {
            return YFl(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public tN putInt(String str, int i10) {
            synchronized (this.Sg) {
                this.tN.put(str, Integer.valueOf(i10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public tN putLong(String str, long j3) {
            synchronized (this.Sg) {
                this.tN.put(str, Long.valueOf(j3));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public tN putFloat(String str, float f10) {
            synchronized (this.Sg) {
                this.tN.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public tN putString(String str, @Nullable String str2) {
            synchronized (this.Sg) {
                this.tN.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public tN putBoolean(String str, boolean z10) {
            synchronized (this.Sg) {
                this.tN.put(str, Boolean.valueOf(z10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public tN remove(String str) {
            synchronized (this.Sg) {
                this.tN.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public tN clear() {
            synchronized (this.Sg) {
                this.AlY = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123 A[Catch: all -> 0x0196, TryCatch #6 {all -> 0x0196, blocks: (B:38:0x0090, B:39:0x0092, B:103:0x0194, B:104:0x0195, B:56:0x011f, B:58:0x0123, B:59:0x012a, B:61:0x0133, B:62:0x013b, B:64:0x0147, B:72:0x00e8, B:73:0x00ee, B:55:0x011e, B:83:0x0117, B:96:0x0192, B:95:0x0189, B:79:0x0111, B:54:0x00e2, B:90:0x0183), top: B:37:0x0090, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133 A[Catch: all -> 0x0196, TryCatch #6 {all -> 0x0196, blocks: (B:38:0x0090, B:39:0x0092, B:103:0x0194, B:104:0x0195, B:56:0x011f, B:58:0x0123, B:59:0x012a, B:61:0x0133, B:62:0x013b, B:64:0x0147, B:72:0x00e8, B:73:0x00ee, B:55:0x011e, B:83:0x0117, B:96:0x0192, B:95:0x0189, B:79:0x0111, B:54:0x00e2, B:90:0x0183), top: B:37:0x0090, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #6 {all -> 0x0196, blocks: (B:38:0x0090, B:39:0x0092, B:103:0x0194, B:104:0x0195, B:56:0x011f, B:58:0x0123, B:59:0x012a, B:61:0x0133, B:62:0x013b, B:64:0x0147, B:72:0x00e8, B:73:0x00ee, B:55:0x011e, B:83:0x0117, B:96:0x0192, B:95:0x0189, B:79:0x0111, B:54:0x00e2, B:90:0x0183), top: B:37:0x0090, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Sg(com.bytedance.sdk.component.Sg.C0078Sg r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Sg.Sg(com.bytedance.sdk.component.Sg$Sg, boolean):void");
    }

    public static void YFl(YFl yFl) {
        GA = yFl;
    }

    @RequiresApi(api = 19)
    public static Sg YFl(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (Sg.class) {
            if (eT == null) {
                eT = new ArrayMap<>();
            }
            File file = eT.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                eT.put(str, file);
            }
            if (YoT == null) {
                YoT = new ArrayMap<>();
            }
            Sg sg2 = YoT.get(file);
            if (sg2 != null) {
                return sg2;
            }
            Sg sg3 = new Sg(file);
            YoT.put(file, sg3);
            return sg3;
        }
    }

    public static File YFl(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00ad -> B:31:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Sg.YFl():void");
    }

    public String YFl(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.Sg) {
            AlY();
            property = this.AlY.getProperty(str, str2);
        }
        return property;
    }

    public int YFl(String str, int i10) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        synchronized (this.Sg) {
            try {
                try {
                    AlY();
                    parseInt = Integer.parseInt(this.AlY.getProperty(str, String.valueOf(i10)));
                } catch (NumberFormatException e2) {
                    Log.e("TTPropHelper", e2.getMessage());
                    return i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return parseInt;
    }

    public long YFl(String str, long j3) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            return j3;
        }
        synchronized (this.Sg) {
            try {
                try {
                    AlY();
                    parseLong = Long.parseLong(this.AlY.getProperty(str, String.valueOf(j3)));
                } catch (NumberFormatException e2) {
                    Log.e("TTPropHelper", e2.getMessage());
                    return j3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return parseLong;
    }

    public float YFl(String str, float f10) {
        float parseFloat;
        if (TextUtils.isEmpty(str)) {
            return f10;
        }
        synchronized (this.Sg) {
            try {
                try {
                    AlY();
                    parseFloat = Float.parseFloat(this.AlY.getProperty(str, String.valueOf(f10)));
                } catch (NumberFormatException e2) {
                    Log.e("TTPropHelper", e2.getMessage());
                    return f10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return parseFloat;
    }

    public boolean YFl(String str, boolean z10) {
        boolean parseBoolean;
        if (TextUtils.isEmpty(str)) {
            return z10;
        }
        synchronized (this.Sg) {
            try {
                try {
                    AlY();
                    parseBoolean = Boolean.parseBoolean(this.AlY.getProperty(str, String.valueOf(z10)));
                } catch (NumberFormatException e2) {
                    Log.e("TTPropHelper", e2.getMessage());
                    return z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return parseBoolean;
    }

    public boolean YFl(String str) {
        boolean containsKey;
        synchronized (this.Sg) {
            try {
                try {
                    AlY();
                    containsKey = this.AlY.containsKey(str);
                } catch (NumberFormatException e2) {
                    Log.e("TTPropHelper", e2.getMessage());
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return containsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(final C0078Sg c0078Sg, final boolean z10) {
        boolean z11;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.Sg.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (Sg.this.tN) {
                    try {
                        Sg.this.Sg(c0078Sg, z10);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (Sg.this.Sg) {
                    Sg.NjR(Sg.this);
                }
            }
        };
        if (z10) {
            synchronized (this.Sg) {
                z11 = this.f10326vc == 1;
            }
            if (z11) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.tN.YFl(runnable, true ^ z10);
    }
}
