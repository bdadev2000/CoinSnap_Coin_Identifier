package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.COT.yRU;
import com.bytedance.component.sdk.annotation.RawRes;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class QR {
    private static final Map<String, vDp<HWF>> zp = new HashMap();
    private static final Set<Object> lMd = new HashSet();
    private static final byte[] KS = {80, 75, 3, 4};

    @WorkerThread
    public static Bj<HWF> KS(Context context, String str) {
        return KS(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static vDp<HWF> lMd(Context context, String str) {
        return lMd(context, str, "asset_".concat(String.valueOf(str)));
    }

    @WorkerThread
    public static Bj<HWF> KS(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return lMd(context.getAssets().open(str), str2);
            }
            return zp(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e4) {
            return new Bj<>((Throwable) e4);
        }
    }

    public static vDp<HWF> lMd(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return zp(str2, new Callable<Bj<HWF>>() { // from class: com.bytedance.adsdk.lottie.QR.4
            @Override // java.util.concurrent.Callable
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public Bj<HWF> call() throws Exception {
                return QR.KS(applicationContext, str, str2);
            }
        });
    }

    public static vDp<HWF> zp(Context context, String str) {
        return zp(context, str, "url_".concat(String.valueOf(str)));
    }

    public static vDp<HWF> zp(final Context context, final String str, final String str2) {
        return zp(str2, new Callable<Bj<HWF>>() { // from class: com.bytedance.adsdk.lottie.QR.1
            @Override // java.util.concurrent.Callable
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public Bj<HWF> call() throws Exception {
                Bj<HWF> zp2 = COT.zp(context).zp(context, str, str2);
                if (str2 != null && zp2.zp() != null) {
                    com.bytedance.adsdk.lottie.KS.COT.zp().zp(str2, zp2.zp());
                }
                return zp2;
            }
        });
    }

    @WorkerThread
    public static Bj<HWF> lMd(Context context, @RawRes int i9) {
        return lMd(context, i9, KS(context, i9));
    }

    public static vDp<HWF> zp(Context context, @RawRes int i9) {
        return zp(context, i9, KS(context, i9));
    }

    @WorkerThread
    public static Bj<HWF> lMd(Context context, @RawRes int i9, String str) {
        try {
            return lMd(context.getResources().openRawResource(i9), KS(context, i9));
        } catch (Resources.NotFoundException e4) {
            return new Bj<>((Throwable) e4);
        }
    }

    public static vDp<HWF> zp(Context context, @RawRes final int i9, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return zp(str, new Callable<Bj<HWF>>() { // from class: com.bytedance.adsdk.lottie.QR.5
            @Override // java.util.concurrent.Callable
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public Bj<HWF> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return QR.lMd(context2, i9, str);
            }
        });
    }

    private static String KS(Context context, @RawRes int i9) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(zp(context) ? "_night_" : "_day_");
        sb.append(i9);
        return sb.toString();
    }

    @WorkerThread
    public static Bj<HWF> lMd(InputStream inputStream, String str) {
        return zp(inputStream, str, true);
    }

    @WorkerThread
    private static Bj<HWF> lMd(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            HWF hwf = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    hwf = zp(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).zp();
                } else {
                    if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                        if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        if (name.contains("../")) {
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            String[] split = name.split("/");
                            String str2 = split[split.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                        break;
                                    } catch (Throwable th2) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                        throw th2;
                                        break;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                file.getAbsolutePath();
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                    }
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] split2 = name.split("/");
                        hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (hwf == null) {
                return new Bj<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                YW zp2 = zp(hwf, (String) entry.getKey());
                if (zp2 != null) {
                    zp2.zp(com.bytedance.adsdk.lottie.HWF.HWF.zp((Bitmap) entry.getValue(), zp2.zp(), zp2.lMd()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z8 = false;
                for (com.bytedance.adsdk.lottie.KS.KS ks : hwf.Bj().values()) {
                    if (ks.zp().equals(entry2.getKey())) {
                        ks.zp((Typeface) entry2.getValue());
                        z8 = true;
                    }
                }
                if (!z8) {
                }
            }
            if (hashMap.isEmpty()) {
                Iterator<Map.Entry<String, YW>> it = hwf.vDp().entrySet().iterator();
                while (it.hasNext()) {
                    YW value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String jU = value.jU();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (jU.startsWith("data:") && jU.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(jU.substring(jU.indexOf(44) + 1), 0);
                            value.zp(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, YW> entry3 : hwf.vDp().entrySet()) {
                if (entry3.getValue().HWF() == null) {
                    return new Bj<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().jU()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.lottie.KS.COT.zp().zp(str, hwf);
            }
            return new Bj<>(hwf);
        } catch (IOException e4) {
            return new Bj<>((Throwable) e4);
        }
    }

    private static boolean zp(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static vDp<HWF> zp(final InputStream inputStream, final String str) {
        return zp(str, new Callable<Bj<HWF>>() { // from class: com.bytedance.adsdk.lottie.QR.6
            @Override // java.util.concurrent.Callable
            /* renamed from: zp, reason: merged with bridge method [inline-methods] */
            public Bj<HWF> call() throws Exception {
                return QR.lMd(inputStream, str);
            }
        });
    }

    @WorkerThread
    private static Bj<HWF> zp(InputStream inputStream, String str, boolean z8) {
        try {
            return zp(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z8) {
                com.bytedance.adsdk.lottie.HWF.HWF.zp(inputStream);
            }
        }
    }

    @WorkerThread
    public static Bj<HWF> zp(JsonReader jsonReader, String str) {
        return zp(jsonReader, str, true);
    }

    private static Bj<HWF> zp(JsonReader jsonReader, String str, boolean z8) {
        try {
            try {
                HWF zp2 = yRU.zp(jsonReader);
                com.bytedance.adsdk.lottie.KS.COT.zp().zp(str, zp2);
                Bj<HWF> bj = new Bj<>(zp2);
                if (z8) {
                    zp(jsonReader);
                }
                return bj;
            } catch (Exception e4) {
                Bj<HWF> bj2 = new Bj<>(e4);
                if (z8) {
                    zp(jsonReader);
                }
                return bj2;
            }
        } catch (Throwable th) {
            if (z8) {
                zp(jsonReader);
            }
            throw th;
        }
    }

    public static void zp(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    @WorkerThread
    public static Bj<HWF> zp(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return lMd(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.lottie.HWF.HWF.zp(zipInputStream);
        }
    }

    private static YW zp(HWF hwf, String str) {
        for (YW yw : hwf.vDp().values()) {
            if (yw.jU().equals(str)) {
                return yw;
            }
        }
        return null;
    }

    private static vDp<HWF> zp(final String str, Callable<Bj<HWF>> callable) {
        final HWF zp2 = str == null ? null : com.bytedance.adsdk.lottie.KS.COT.zp().zp(str);
        if (zp2 != null) {
            return new vDp<>(new Callable<Bj<HWF>>() { // from class: com.bytedance.adsdk.lottie.QR.7
                @Override // java.util.concurrent.Callable
                /* renamed from: zp, reason: merged with bridge method [inline-methods] */
                public Bj<HWF> call() throws Exception {
                    return new Bj<>(HWF.this);
                }
            });
        }
        if (str != null) {
            Map<String, vDp<HWF>> map = zp;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        vDp<HWF> vdp = new vDp<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vdp.zp(new dT<HWF>() { // from class: com.bytedance.adsdk.lottie.QR.2
                @Override // com.bytedance.adsdk.lottie.dT
                public void zp(HWF hwf) {
                    QR.zp.remove(str);
                    atomicBoolean.set(true);
                    if (QR.zp.size() == 0) {
                        QR.lMd(true);
                    }
                }
            });
            vdp.KS(new dT<Throwable>() { // from class: com.bytedance.adsdk.lottie.QR.3
                @Override // com.bytedance.adsdk.lottie.dT
                public void zp(Throwable th) {
                    QR.zp.remove(str);
                    atomicBoolean.set(true);
                    if (QR.zp.size() == 0) {
                        QR.lMd(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, vDp<HWF>> map2 = zp;
                map2.put(str, vdp);
                if (map2.size() == 1) {
                    lMd(false);
                }
            }
        }
        return vdp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(boolean z8) {
        ArrayList arrayList = new ArrayList(lMd);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            arrayList.get(i9);
        }
    }
}
