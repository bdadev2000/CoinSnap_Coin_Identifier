package com.bytedance.adsdk.Sg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.Sg.wN.VOe;
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
public class qsH {
    private static final Map<String, GA<DSW>> YFl = new HashMap();
    private static final Set<Object> Sg = new HashSet();
    private static final byte[] tN = {80, 75, 3, 4};

    public static GA<DSW> Sg(Context context, String str) {
        return Sg(context, str, "asset_".concat(String.valueOf(str)));
    }

    @WorkerThread
    public static YoT<DSW> tN(Context context, String str) {
        return tN(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static GA<DSW> Sg(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return YFl(str2, new Callable<YoT<DSW>>() { // from class: com.bytedance.adsdk.Sg.qsH.4
            @Override // java.util.concurrent.Callable
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public YoT<DSW> call() throws Exception {
                return qsH.tN(applicationContext, str, str2);
            }
        });
    }

    public static GA<DSW> YFl(Context context, String str) {
        return YFl(context, str, "url_".concat(String.valueOf(str)));
    }

    @WorkerThread
    public static YoT<DSW> tN(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return Sg(context.getAssets().open(str), str2);
            }
            return YFl(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e2) {
            return new YoT<>((Throwable) e2);
        }
    }

    public static GA<DSW> YFl(final Context context, final String str, final String str2) {
        return YFl(str2, new Callable<YoT<DSW>>() { // from class: com.bytedance.adsdk.Sg.qsH.1
            @Override // java.util.concurrent.Callable
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public YoT<DSW> call() throws Exception {
                YoT<DSW> YFl2 = wN.YFl(context).YFl(context, str, str2);
                if (str2 != null && YFl2.YFl() != null) {
                    com.bytedance.adsdk.Sg.tN.wN.YFl().YFl(str2, YFl2.YFl());
                }
                return YFl2;
            }
        });
    }

    @WorkerThread
    public static YoT<DSW> Sg(Context context, @RawRes int i10) {
        return Sg(context, i10, tN(context, i10));
    }

    public static GA<DSW> YFl(Context context, @RawRes int i10) {
        return YFl(context, i10, tN(context, i10));
    }

    @WorkerThread
    public static YoT<DSW> Sg(Context context, @RawRes int i10, String str) {
        try {
            return Sg(context.getResources().openRawResource(i10), tN(context, i10));
        } catch (Resources.NotFoundException e2) {
            return new YoT<>((Throwable) e2);
        }
    }

    public static GA<DSW> YFl(Context context, @RawRes final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return YFl(str, new Callable<YoT<DSW>>() { // from class: com.bytedance.adsdk.Sg.qsH.5
            @Override // java.util.concurrent.Callable
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public YoT<DSW> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return qsH.Sg(context2, i10, str);
            }
        });
    }

    private static String tN(Context context, @RawRes int i10) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append(YFl(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    @WorkerThread
    public static YoT<DSW> Sg(InputStream inputStream, String str) {
        return YFl(inputStream, str, true);
    }

    @WorkerThread
    private static YoT<DSW> Sg(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            DSW dsw = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    dsw = YFl(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).YFl();
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
                                } finally {
                                    try {
                                        break;
                                    } finally {
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
            if (dsw == null) {
                return new YoT<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                nc YFl2 = YFl(dsw, (String) entry.getKey());
                if (YFl2 != null) {
                    YFl2.YFl(com.bytedance.adsdk.Sg.vc.vc.YFl((Bitmap) entry.getValue(), YFl2.YFl(), YFl2.Sg()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z10 = false;
                for (com.bytedance.adsdk.Sg.tN.tN tNVar : dsw.EH().values()) {
                    if (tNVar.YFl().equals(entry2.getKey())) {
                        tNVar.YFl((Typeface) entry2.getValue());
                        z10 = true;
                    }
                }
                if (!z10) {
                }
            }
            if (hashMap.isEmpty()) {
                Iterator<Map.Entry<String, nc>> it = dsw.rkt().entrySet().iterator();
                while (it.hasNext()) {
                    nc value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String qsH = value.qsH();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (qsH.startsWith("data:") && qsH.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(qsH.substring(qsH.indexOf(44) + 1), 0);
                            value.YFl(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, nc> entry3 : dsw.rkt().entrySet()) {
                if (entry3.getValue().nc() == null) {
                    return new YoT<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().qsH()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.Sg.tN.wN.YFl().YFl(str, dsw);
            }
            return new YoT<>(dsw);
        } catch (IOException e2) {
            return new YoT<>((Throwable) e2);
        }
    }

    private static boolean YFl(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static GA<DSW> YFl(final InputStream inputStream, final String str) {
        return YFl(str, new Callable<YoT<DSW>>() { // from class: com.bytedance.adsdk.Sg.qsH.6
            @Override // java.util.concurrent.Callable
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public YoT<DSW> call() throws Exception {
                return qsH.Sg(inputStream, str);
            }
        });
    }

    @WorkerThread
    private static YoT<DSW> YFl(InputStream inputStream, String str, boolean z10) {
        try {
            return YFl(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z10) {
                com.bytedance.adsdk.Sg.vc.vc.YFl(inputStream);
            }
        }
    }

    @WorkerThread
    public static YoT<DSW> YFl(JsonReader jsonReader, String str) {
        return YFl(jsonReader, str, true);
    }

    private static YoT<DSW> YFl(JsonReader jsonReader, String str, boolean z10) {
        try {
            try {
                DSW YFl2 = VOe.YFl(jsonReader);
                com.bytedance.adsdk.Sg.tN.wN.YFl().YFl(str, YFl2);
                YoT<DSW> yoT = new YoT<>(YFl2);
                if (z10) {
                    YFl(jsonReader);
                }
                return yoT;
            } catch (Exception e2) {
                YoT<DSW> yoT2 = new YoT<>(e2);
                if (z10) {
                    YFl(jsonReader);
                }
                return yoT2;
            }
        } catch (Throwable th2) {
            if (z10) {
                YFl(jsonReader);
            }
            throw th2;
        }
    }

    public static void YFl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    @WorkerThread
    public static YoT<DSW> YFl(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return Sg(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.Sg.vc.vc.YFl(zipInputStream);
        }
    }

    private static nc YFl(DSW dsw, String str) {
        for (nc ncVar : dsw.rkt().values()) {
            if (ncVar.qsH().equals(str)) {
                return ncVar;
            }
        }
        return null;
    }

    private static GA<DSW> YFl(final String str, Callable<YoT<DSW>> callable) {
        final DSW YFl2 = str == null ? null : com.bytedance.adsdk.Sg.tN.wN.YFl().YFl(str);
        if (YFl2 != null) {
            return new GA<>(new Callable<YoT<DSW>>() { // from class: com.bytedance.adsdk.Sg.qsH.7
                @Override // java.util.concurrent.Callable
                /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
                public YoT<DSW> call() throws Exception {
                    return new YoT<>(DSW.this);
                }
            });
        }
        if (str != null) {
            Map<String, GA<DSW>> map = YFl;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        GA<DSW> ga2 = new GA<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ga2.YFl(new eT<DSW>() { // from class: com.bytedance.adsdk.Sg.qsH.2
                @Override // com.bytedance.adsdk.Sg.eT
                public void YFl(DSW dsw) {
                    qsH.YFl.remove(str);
                    atomicBoolean.set(true);
                    if (qsH.YFl.size() == 0) {
                        qsH.Sg(true);
                    }
                }
            });
            ga2.tN(new eT<Throwable>() { // from class: com.bytedance.adsdk.Sg.qsH.3
                @Override // com.bytedance.adsdk.Sg.eT
                public void YFl(Throwable th2) {
                    qsH.YFl.remove(str);
                    atomicBoolean.set(true);
                    if (qsH.YFl.size() == 0) {
                        qsH.Sg(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, GA<DSW>> map2 = YFl;
                map2.put(str, ga2);
                if (map2.size() == 1) {
                    Sg(false);
                }
            }
        }
        return ga2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(boolean z10) {
        ArrayList arrayList = new ArrayList(Sg);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10);
        }
    }
}
