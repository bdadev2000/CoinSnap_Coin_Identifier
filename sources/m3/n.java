package m3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public abstract class n {
    public static final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f21574b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f21575c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f21576d = {Ascii.US, -117, 8};

    public static d0 a(final String str, Callable callable, androidx.activity.d dVar) {
        j a10;
        Throwable th2;
        Object obj;
        d0 d0Var = null;
        if (str == null) {
            a10 = null;
        } else {
            a10 = r3.g.f23992b.a(str);
        }
        if (a10 != null) {
            d0Var = new d0(a10);
        }
        HashMap hashMap = a;
        if (str != null && hashMap.containsKey(str)) {
            d0Var = (d0) hashMap.get(str);
        }
        if (d0Var != null) {
            if (dVar != null) {
                dVar.run();
            }
            return d0Var;
        }
        final int i10 = 0;
        d0 d0Var2 = new d0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            z zVar = new z() { // from class: m3.l
                @Override // m3.z
                public final void onResult(Object obj2) {
                    int i11 = i10;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i11) {
                        case 0:
                            HashMap hashMap2 = n.a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                n.i();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = n.a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                n.i();
                                return;
                            }
                            return;
                    }
                }
            };
            synchronized (d0Var2) {
                b0 b0Var = d0Var2.f21527d;
                if (b0Var != null && (obj = b0Var.a) != null) {
                    zVar.onResult(obj);
                }
                d0Var2.a.add(zVar);
            }
            final int i11 = 1;
            z zVar2 = new z() { // from class: m3.l
                @Override // m3.z
                public final void onResult(Object obj2) {
                    int i112 = i11;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i112) {
                        case 0:
                            HashMap hashMap2 = n.a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                n.i();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = n.a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                n.i();
                                return;
                            }
                            return;
                    }
                }
            };
            synchronized (d0Var2) {
                b0 b0Var2 = d0Var2.f21527d;
                if (b0Var2 != null && (th2 = b0Var2.f21521b) != null) {
                    zVar2.onResult(th2);
                }
                d0Var2.f21525b.add(zVar2);
            }
            if (!atomicBoolean.get()) {
                hashMap.put(str, d0Var2);
                if (hashMap.size() == 1) {
                    i();
                }
            }
        }
        return d0Var2;
    }

    public static b0 b(Context context, String str, String str2) {
        j a10;
        if (str2 == null) {
            a10 = null;
        } else {
            a10 = r3.g.f23992b.a(str2);
        }
        if (a10 != null) {
            return new b0(a10);
        }
        try {
            ki.e0 f10 = a6.k.f(a6.k.N(context.getAssets().open(str)));
            if (h(f10, f21575c).booleanValue()) {
                return f(context, new ZipInputStream(f10.inputStream()), str2);
            }
            if (h(f10, f21576d).booleanValue()) {
                return c(new GZIPInputStream(f10.inputStream()), str2);
            }
            return c(f10.inputStream(), str2);
        } catch (IOException e2) {
            return new b0(e2);
        }
    }

    public static b0 c(InputStream inputStream, String str) {
        ki.e0 f10 = a6.k.f(a6.k.N(inputStream));
        String[] strArr = x3.b.f27349g;
        return d(new x3.c(f10), str, true);
    }

    public static b0 d(x3.c cVar, String str, boolean z10) {
        j a10;
        try {
            if (str == null) {
                a10 = null;
            } else {
                try {
                    a10 = r3.g.f23992b.a(str);
                } catch (Exception e2) {
                    b0 b0Var = new b0(e2);
                    if (z10) {
                        y3.h.b(cVar);
                    }
                    return b0Var;
                }
            }
            if (a10 != null) {
                b0 b0Var2 = new b0(a10);
                if (z10) {
                    y3.h.b(cVar);
                }
                return b0Var2;
            }
            j a11 = w3.s.a(cVar);
            if (str != null) {
                r3.g.f23992b.a.put(str, a11);
            }
            b0 b0Var3 = new b0(a11);
            if (z10) {
                y3.h.b(cVar);
            }
            return b0Var3;
        } catch (Throwable th2) {
            if (z10) {
                y3.h.b(cVar);
            }
            throw th2;
        }
    }

    public static b0 e(Context context, int i10, String str) {
        j a10;
        if (str == null) {
            a10 = null;
        } else {
            a10 = r3.g.f23992b.a(str);
        }
        if (a10 != null) {
            return new b0(a10);
        }
        try {
            ki.e0 f10 = a6.k.f(a6.k.N(context.getResources().openRawResource(i10)));
            if (h(f10, f21575c).booleanValue()) {
                return f(context, new ZipInputStream(f10.inputStream()), str);
            }
            if (h(f10, f21576d).booleanValue()) {
                try {
                    return c(new GZIPInputStream(f10.inputStream()), str);
                } catch (IOException e2) {
                    return new b0(e2);
                }
            }
            return c(f10.inputStream(), str);
        } catch (Resources.NotFoundException e10) {
            return new b0(e10);
        }
    }

    public static b0 f(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return g(context, zipInputStream, str);
        } finally {
            y3.h.b(zipInputStream);
        }
    }

    public static b0 g(Context context, ZipInputStream zipInputStream, String str) {
        j a10;
        y yVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = r3.g.f23992b.a(str);
            } catch (IOException e2) {
                return new b0(e2);
            }
        }
        if (a10 != null) {
            return new b0(a10);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        j jVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                ki.e0 f10 = a6.k.f(a6.k.N(zipInputStream));
                String[] strArr = x3.b.f27349g;
                jVar = (j) d(new x3.c(f10), null, false).a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
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
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                            break;
                        }
                    } catch (Throwable th4) {
                        y3.b.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        y3.b.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (jVar == null) {
            return new b0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = jVar.c().values().iterator();
            while (true) {
                if (it.hasNext()) {
                    yVar = (y) it.next();
                    if (yVar.f21617d.equals(str4)) {
                        break;
                    }
                } else {
                    yVar = null;
                    break;
                }
            }
            if (yVar != null) {
                Bitmap bitmap = (Bitmap) entry.getValue();
                int width = bitmap.getWidth();
                int i10 = yVar.a;
                int i11 = yVar.f21615b;
                if (width != i10 || bitmap.getHeight() != i11) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                    bitmap.recycle();
                    bitmap = createScaledBitmap;
                }
                yVar.f21619f = bitmap;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z10 = false;
            for (r3.c cVar : jVar.f21555f.values()) {
                if (cVar.a.equals(entry2.getKey())) {
                    cVar.f23985d = (Typeface) entry2.getValue();
                    z10 = true;
                }
            }
            if (!z10) {
                y3.b.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = jVar.c().entrySet().iterator();
            while (it2.hasNext()) {
                y yVar2 = (y) ((Map.Entry) it2.next()).getValue();
                if (yVar2 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = yVar2.f21617d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        yVar2.f21619f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e10) {
                        y3.b.c("data URL did not have correct base64 format.", e10);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            r3.g.f23992b.a.put(str, jVar);
        }
        return new b0(jVar);
    }

    public static Boolean h(ki.e0 e0Var, byte[] bArr) {
        try {
            ki.e0 d10 = e0Var.d();
            for (byte b3 : bArr) {
                if (d10.readByte() != b3) {
                    return Boolean.FALSE;
                }
            }
            d10.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            y3.b.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void i() {
        ArrayList arrayList = new ArrayList(f21574b);
        if (arrayList.size() <= 0) {
            return;
        }
        a4.j.t(arrayList.get(0));
        throw null;
    }

    public static String j(Context context, int i10) {
        boolean z10;
        String str;
        StringBuilder sb2 = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }
}
