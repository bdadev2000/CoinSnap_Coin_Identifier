package v1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import com.vungle.ads.L;
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
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f23505a = new HashMap();
    public static final HashSet b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f23506c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f23507d = {Ascii.US, -117, 8};

    public static C2836B a(final String str, Callable callable, L l) {
        i a6;
        C2836B c2836b = null;
        if (str == null) {
            a6 = null;
        } else {
            a6 = A1.g.b.a(str);
        }
        if (a6 != null) {
            c2836b = new C2836B(a6);
        }
        HashMap hashMap = f23505a;
        if (str != null && hashMap.containsKey(str)) {
            c2836b = (C2836B) hashMap.get(str);
        }
        if (c2836b != null) {
            if (l != null) {
                l.run();
            }
            return c2836b;
        }
        C2836B c2836b2 = new C2836B(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i9 = 0;
            c2836b2.b(new x() { // from class: v1.k
                @Override // v1.x
                public final void onResult(Object obj) {
                    switch (i9) {
                        case 0:
                            HashMap hashMap2 = m.f23505a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                m.i();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = m.f23505a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                m.i();
                                return;
                            }
                            return;
                    }
                }
            });
            final int i10 = 1;
            c2836b2.a(new x() { // from class: v1.k
                @Override // v1.x
                public final void onResult(Object obj) {
                    switch (i10) {
                        case 0:
                            HashMap hashMap2 = m.f23505a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                m.i();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = m.f23505a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                m.i();
                                return;
                            }
                            return;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, c2836b2);
                if (hashMap.size() == 1) {
                    i();
                }
            }
        }
        return c2836b2;
    }

    public static z b(Context context, String str, String str2) {
        i a6;
        if (str2 == null) {
            a6 = null;
        } else {
            a6 = A1.g.b.a(str2);
        }
        if (a6 != null) {
            return new z(a6);
        }
        try {
            w8.t f9 = r8.k.f(r8.k.y(context.getAssets().open(str)));
            if (h(f9, f23506c).booleanValue()) {
                return f(context, new ZipInputStream(new w8.e(f9, 1)), str2);
            }
            if (h(f9, f23507d).booleanValue()) {
                return c(new GZIPInputStream(new w8.e(f9, 1)), str2);
            }
            return c(new w8.e(f9, 1), str2);
        } catch (IOException e4) {
            return new z(e4);
        }
    }

    public static z c(InputStream inputStream, String str) {
        w8.t f9 = r8.k.f(r8.k.y(inputStream));
        String[] strArr = G1.c.f1250g;
        return d(new G1.d(f9), str, true);
    }

    public static z d(G1.d dVar, String str, boolean z8) {
        i a6;
        try {
            if (str == null) {
                a6 = null;
            } else {
                try {
                    a6 = A1.g.b.a(str);
                } catch (Exception e4) {
                    z zVar = new z(e4);
                    if (z8) {
                        H1.i.b(dVar);
                    }
                    return zVar;
                }
            }
            if (a6 != null) {
                z zVar2 = new z(a6);
                if (z8) {
                    H1.i.b(dVar);
                }
                return zVar2;
            }
            i a9 = F1.s.a(dVar);
            if (str != null) {
                A1.g.b.f23a.put(str, a9);
            }
            z zVar3 = new z(a9);
            if (z8) {
                H1.i.b(dVar);
            }
            return zVar3;
        } catch (Throwable th) {
            if (z8) {
                H1.i.b(dVar);
            }
            throw th;
        }
    }

    public static z e(Context context, int i9, String str) {
        i a6;
        if (str == null) {
            a6 = null;
        } else {
            a6 = A1.g.b.a(str);
        }
        if (a6 != null) {
            return new z(a6);
        }
        try {
            w8.t f9 = r8.k.f(r8.k.y(context.getResources().openRawResource(i9)));
            if (h(f9, f23506c).booleanValue()) {
                return f(context, new ZipInputStream(new w8.e(f9, 1)), str);
            }
            if (h(f9, f23507d).booleanValue()) {
                try {
                    return c(new GZIPInputStream(new w8.e(f9, 1)), str);
                } catch (IOException e4) {
                    return new z(e4);
                }
            }
            return c(new w8.e(f9, 1), str);
        } catch (Resources.NotFoundException e9) {
            return new z(e9);
        }
    }

    public static z f(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return g(context, zipInputStream, str);
        } finally {
            H1.i.b(zipInputStream);
        }
    }

    public static z g(Context context, ZipInputStream zipInputStream, String str) {
        i a6;
        w wVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a6 = null;
        } else {
            try {
                a6 = A1.g.b.a(str);
            } catch (IOException e4) {
                return new z(e4);
            }
        }
        if (a6 != null) {
            return new z(a6);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        i iVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                w8.t f9 = r8.k.f(r8.k.y(zipInputStream));
                String[] strArr = G1.c.f1250g;
                iVar = (i) d(new G1.d(f9), null, false).f23601a;
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
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    } catch (Throwable th3) {
                        H1.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        H1.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (iVar == null) {
            return new z(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = iVar.c().values().iterator();
            while (true) {
                if (it.hasNext()) {
                    wVar = (w) it.next();
                    if (wVar.f23564d.equals(str4)) {
                        break;
                    }
                } else {
                    wVar = null;
                    break;
                }
            }
            if (wVar != null) {
                Bitmap bitmap = (Bitmap) entry.getValue();
                int width = bitmap.getWidth();
                int i9 = wVar.f23562a;
                int i10 = wVar.b;
                if (width != i9 || bitmap.getHeight() != i10) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i9, i10, true);
                    bitmap.recycle();
                    bitmap = createScaledBitmap;
                }
                wVar.f23566f = bitmap;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z8 = false;
            for (A1.c cVar : iVar.f23488f.values()) {
                if (cVar.f14a.equals(entry2.getKey())) {
                    cVar.f16d = (Typeface) entry2.getValue();
                    z8 = true;
                }
            }
            if (!z8) {
                H1.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = iVar.c().entrySet().iterator();
            while (it2.hasNext()) {
                w wVar2 = (w) ((Map.Entry) it2.next()).getValue();
                if (wVar2 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = wVar2.f23564d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        wVar2.f23566f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e9) {
                        H1.c.c("data URL did not have correct base64 format.", e9);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            A1.g.b.f23a.put(str, iVar);
        }
        return new z(iVar);
    }

    public static Boolean h(w8.t tVar, byte[] bArr) {
        try {
            w8.t a6 = tVar.a();
            for (byte b8 : bArr) {
                if (a6.readByte() != b8) {
                    return Boolean.FALSE;
                }
            }
            a6.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            H1.c.f1349a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void i() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.entity.o.v(arrayList.get(0));
        throw null;
    }

    public static String j(Context context, int i9) {
        String str;
        StringBuilder sb = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i9);
        return sb.toString();
    }
}
