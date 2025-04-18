package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.ca;
import com.applovin.impl.jn;
import com.applovin.impl.la;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.u2;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: b */
    private final j f26704b;

    /* renamed from: c */
    private final n f26705c;

    /* renamed from: a */
    private final String f26703a = "FileManager";
    private final Object d = new Object();
    private final Set e = new HashSet();

    public l(j jVar) {
        this.f26704b = jVar;
        this.f26705c = jVar.J();
    }

    private boolean f(File file) {
        if (n.a()) {
            this.f26705c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            boolean delete = file.delete();
            if (!delete) {
                this.f26704b.E().a(la.K, "removeFile", (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
            }
            g(file);
            return delete;
        } catch (Throwable th) {
            try {
                if (n.a()) {
                    this.f26705c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f26704b.E().a("FileManager", "removeFile", th);
                g(file);
                return false;
            } catch (Throwable th2) {
                g(file);
                throw th2;
            }
        }
    }

    private void g(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            try {
                if (!this.e.remove(absolutePath)) {
                    this.f26704b.E().a(la.K, "unlockFile", (Map) CollectionUtils.hashMap("path", absolutePath));
                }
                this.d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f26704b.j0().a((yl) new jn(this.f26704b, false, "removeCachedResourcesForAd", new a0(this, bVar, context, 1)), tm.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f26704b.j0().a((yl) new jn(this.f26704b, false, "removeCachedVideoResourceForAd", new a0(this, bVar, context, 0)), tm.b.CACHING);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable, boolean] */
    public String e(File file) {
        Throwable th;
        InputStream inputStream;
        IOException e;
        FileNotFoundException e2;
        if (file == null) {
            return null;
        }
        if (n.a()) {
            this.f26705c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        ?? booleanValue = ((Boolean) this.f26704b.a(sj.D)).booleanValue();
        boolean z2 = true;
        try {
            try {
                try {
                    try {
                        if (booleanValue != 0) {
                            try {
                                try {
                                    try {
                                        FileInputStream fileInputStream = new FileInputStream(file);
                                        try {
                                            c(file);
                                            String a2 = a(fileInputStream);
                                            r7 = a2 == null;
                                            fileInputStream.close();
                                            if (r7 && ((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                                                a(file, "removeFileAfterReadFail");
                                            }
                                            g(file);
                                            return a2;
                                        } catch (Throwable th2) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e3) {
                                        if (n.a()) {
                                            this.f26705c.d("FileManager", "File not found. " + e3);
                                        }
                                        this.f26705c.a("FileManager", e3);
                                        this.f26704b.E().a("FileManager", "readFileNotFound", e3);
                                        if (0 != 0 && ((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                                            a(file, "removeFileAfterReadFail");
                                        }
                                        g(file);
                                        return null;
                                    }
                                } catch (Throwable th4) {
                                    if (n.a()) {
                                        this.f26705c.a("FileManager", "Unknown failure to read file.", th4);
                                    }
                                    this.f26705c.a("FileManager", th4);
                                    this.f26704b.E().a("FileManager", "readFile", th4);
                                    if (((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                                        a(file, "removeFileAfterReadFail");
                                    }
                                    g(file);
                                    return null;
                                }
                            } catch (IOException e4) {
                                if (n.a()) {
                                    this.f26705c.a("FileManager", "Failed to read file: " + file.getName() + e4);
                                }
                                this.f26705c.a("FileManager", e4);
                                this.f26704b.E().a("FileManager", "readFileIO", e4);
                                if (((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            }
                        }
                        try {
                            c(file);
                            inputStream = new FileInputStream(file);
                        } catch (FileNotFoundException e5) {
                            e2 = e5;
                            inputStream = null;
                        } catch (IOException e6) {
                            e = e6;
                            inputStream = null;
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                        try {
                            String a3 = a(inputStream);
                            r7 = a3 == null;
                            yp.a(inputStream, this.f26704b);
                            if (r7 && ((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return a3;
                        } catch (FileNotFoundException e7) {
                            e2 = e7;
                            if (n.a()) {
                                this.f26705c.d("FileManager", "File not found. " + e2);
                            }
                            this.f26704b.E().a("FileManager", "readFileNotFound", e2);
                            yp.a(inputStream, this.f26704b);
                            g(file);
                            return null;
                        } catch (IOException e8) {
                            e = e8;
                            if (n.a()) {
                                this.f26705c.a("FileManager", "Failed to read file: " + file.getName() + e);
                            }
                            this.f26704b.E().a("FileManager", "readFileIO", e);
                            yp.a(inputStream, this.f26704b);
                            if (((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        } catch (Throwable th6) {
                            th = th6;
                            if (n.a()) {
                                this.f26705c.a("FileManager", "Unknown failure to read file.", th);
                            }
                            this.f26704b.E().a("FileManager", "readFile", th);
                            yp.a(inputStream, this.f26704b);
                            if (((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        yp.a((Closeable) booleanValue, this.f26704b);
                        if (r7) {
                            a(file, "removeFileAfterReadFail");
                        }
                        g(file);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (z2) {
                        a(file, "removeFileAfterReadFail");
                    }
                    g(file);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                z2 = false;
                if (z2 && ((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                g(file);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            r7 = true;
            yp.a((Closeable) booleanValue, this.f26704b);
            if (r7 && ((Boolean) this.f26704b.a(sj.f26916f1)).booleanValue()) {
                a(file, "removeFileAfterReadFail");
            }
            g(file);
            throw th;
        }
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            boolean add = this.e.add(absolutePath);
            while (!add) {
                try {
                    this.d.wait();
                    add = this.e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (n.a()) {
                        this.f26705c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private boolean d(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            try {
                if (this.e.contains(absolutePath)) {
                    return false;
                }
                c(file);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z2, u2 u2Var, int i2) {
        return a(context, str, str2, list, z2, false, u2Var, i2);
    }

    public void b(Context context) {
        if (this.f26704b.x0()) {
            if (n.a()) {
                this.f26705c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z2, boolean z3, u2 u2Var, int i2) {
        if (!StringUtils.isValidString(str)) {
            if (n.a()) {
                this.f26705c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f26704b.E().a(la.K, "cacheResource");
            return null;
        }
        String a2 = yp.a(Uri.parse(str), str2, this.f26704b);
        File a3 = a(a2, context);
        if (!a(a3, str, list, z2, u2Var, i2)) {
            return null;
        }
        if (n.a()) {
            com.applovin.impl.adview.t.v("Caching succeeded for file ", a2, this.f26705c, "FileManager");
        }
        return z3 ? Uri.fromFile(a3).toString() : a2;
    }

    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        f(a(bVar.t0().getLastPathSegment(), context));
    }

    private boolean b(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            contains = this.e.contains(absolutePath);
        }
        return contains;
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    private List c(Context context) {
        File[] listFiles;
        File d = d(context);
        if (d.isDirectory() && (listFiles = d.listFiles()) != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public boolean c(String str, Context context) {
        boolean z2 = false;
        File a2 = a(str, false, context);
        if (!d(a2)) {
            return false;
        }
        if (a2.exists() && !a2.isDirectory()) {
            z2 = true;
        }
        g(a2);
        return z2;
    }

    public boolean a(File file, String str, List list, u2 u2Var, int i2) {
        return a(file, str, list, true, u2Var, i2);
    }

    private boolean a(File file, String str, List list, boolean z2, u2 u2Var) {
        InputStream inputStream;
        if (a(file)) {
            if (n.a()) {
                com.applovin.impl.adview.t.v("File exists for ", str, this.f26705c, "FileManager");
            }
            if (u2Var == null) {
                return true;
            }
            u2Var.a(file.length());
            return true;
        }
        if (((Boolean) this.f26704b.a(sj.D)).booleanValue()) {
            try {
                InputStream a2 = a(str, list, z2, u2Var);
                try {
                    boolean a3 = a(a2, file);
                    if (a2 != null) {
                        a2.close();
                    }
                    return a3;
                } finally {
                }
            } catch (Throwable th) {
                this.f26705c.a("FileManager", th);
                this.f26704b.E().a("FileManager", "loadAndCacheResource", th);
                return false;
            }
        }
        try {
            inputStream = a(str, list, z2, u2Var);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean a4 = a(inputStream, file);
            yp.a(inputStream, this.f26704b);
            return a4;
        } catch (Throwable th3) {
            th = th3;
            yp.a(inputStream, this.f26704b);
            throw th;
        }
    }

    private boolean a(File file, String str, List list, boolean z2, u2 u2Var, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            if (a(file, str, list, z2, u2Var)) {
                if (i3 > 1) {
                    HashMap hashMap = new HashMap(3);
                    hashMap.put("source", "assetSuccessfullyRedownloadedAndCached");
                    hashMap.put("details", String.valueOf(i3));
                    hashMap.put("url", str);
                    this.f26704b.E().a(la.P, (Map) hashMap);
                }
                return true;
            }
        }
        return false;
    }

    public InputStream a(String str, List list, boolean z2, u2 u2Var) {
        HttpURLConnection httpURLConnection;
        if (z2 && !yp.a(str, list)) {
            if (n.a()) {
                com.applovin.impl.adview.t.v("Domain is not whitelisted, skipping precache for url: ", str, this.f26705c, "FileManager");
            }
            return null;
        }
        if (((Boolean) this.f26704b.a(sj.m3)).booleanValue() && !str.contains("https://")) {
            if (n.a()) {
                this.f26705c.k("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (n.a()) {
            this.f26705c.a("FileManager", "Loading " + str + "...");
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(((Integer) this.f26704b.a(sj.k3)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.f26704b.a(sj.l3)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int httpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            u2Var.a(httpUrlConnectionGetResponseCode);
            this.f26704b.E().a("loadResource", str, httpUrlConnectionGetResponseCode);
            if (httpUrlConnectionGetResponseCode >= 200 && httpUrlConnectionGetResponseCode < 300) {
                if (n.a()) {
                    this.f26705c.a("FileManager", "Opened stream to resource " + str);
                }
                InputStream urlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                if (((Boolean) this.f26704b.a(sj.J3)).booleanValue()) {
                    yp.a(httpURLConnection, this.f26704b);
                }
                return urlConnectionGetInputStream;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            try {
                if (n.a()) {
                    this.f26705c.a("FileManager", "Error loading " + str, th);
                }
                this.f26704b.E().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", str));
                u2Var.a(th);
                if (((Boolean) this.f26704b.a(sj.J3)).booleanValue()) {
                    yp.a(httpURLConnection, this.f26704b);
                }
                return null;
            } finally {
                if (((Boolean) this.f26704b.a(sj.J3)).booleanValue()) {
                    yp.a(httpURLConnection, this.f26704b);
                }
            }
        }
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (n.a()) {
                this.f26705c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (n.a()) {
                this.f26705c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f26704b.E().a(la.K, "createNoMediaFile");
        } catch (IOException e) {
            if (n.a()) {
                this.f26705c.a("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z2, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (n.a()) {
                this.f26705c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (n.a()) {
            com.applovin.impl.adview.t.v("Looking up cached resource: ", str, this.f26705c, "FileManager");
        }
        String replace = str.contains("icon") ? str.replace(RemoteSettings.FORWARD_SLASH_STRING, "_").replace(".", "_") : str;
        File d = d(context);
        File file = new File(d, replace);
        if (yp.a(sj.f26922h1, this.f26704b)) {
            boolean z3 = file.length() == 0;
            boolean equals = str.equals(".nomedia");
            if (file.exists() && z3 && !equals) {
                this.f26704b.E().a(la.K, "removeEmptyCachedResource", (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
                f(file);
            }
        }
        if (z2) {
            try {
                d.mkdirs();
            } catch (Throwable th) {
                if (n.a()) {
                    this.f26705c.a("FileManager", "Unable to make cache directory at " + d, th);
                }
                this.f26704b.E().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    public String a(InputStream inputStream) {
        if (((Boolean) this.f26704b.a(sj.D)).booleanValue()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 8192);
                        if (read >= 0) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                            byteArrayOutputStream.close();
                            return byteArrayOutputStream2;
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                this.f26705c.a("FileManager", th);
                this.f26704b.E().a("FileManager", "readInputStreamAsString", th);
                return null;
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[8192];
            while (true) {
                int read2 = inputStream.read(bArr2, 0, 8192);
                if (read2 >= 0) {
                    try {
                        byteArrayOutputStream3.write(bArr2, 0, read2);
                    } catch (Throwable th2) {
                        yp.a(byteArrayOutputStream3, this.f26704b);
                        this.f26704b.E().a("FileManager", "readInputStreamAsString", th2);
                        return null;
                    }
                } else {
                    return byteArrayOutputStream3.toString("UTF-8");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01bf A[Catch: all -> 0x01c5, TRY_LEAVE, TryCatch #1 {all -> 0x01c5, blocks: (B:123:0x01b9, B:125:0x01bf), top: B:122:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec A[Catch: all -> 0x00f2, TryCatch #9 {all -> 0x00f2, blocks: (B:44:0x00e6, B:46:0x00ec, B:47:0x00f5), top: B:43:0x00e6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.io.InputStream r17, java.io.File r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.a(java.io.InputStream, java.io.File, boolean):boolean");
    }

    public boolean a(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (n.a()) {
            this.f26705c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file, false)) {
            if (n.a()) {
                this.f26705c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        }
        if (!n.a()) {
            return true;
        }
        this.f26705c.a("FileManager", "Caching completed for " + file);
        return true;
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List Y = bVar.Y();
        if (bVar.S0() || Y.contains(str)) {
            return bVar.F();
        }
        return 1;
    }

    private long a(Context context) {
        long a2 = a();
        boolean z2 = a2 != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List c2 = this.f26704b.c(sj.f26904a1);
        long j2 = 0;
        for (File file : c(context)) {
            if (z2 && !c2.contains(file.getName()) && !b(file) && seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) > a2) {
                if (n.a()) {
                    this.f26705c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                if (f(file)) {
                    this.f26704b.D().c(ca.f23246j);
                }
            }
            j2 += file.length();
        }
        return j2;
    }

    private void a(long j2, Context context) {
        long intValue = ((Integer) this.f26704b.a(sj.W0)).intValue();
        if (intValue == -1) {
            if (n.a()) {
                this.f26705c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j2) > intValue) {
                if (n.a()) {
                    this.f26705c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    f((File) it.next());
                }
                this.f26704b.D().c(ca.f23247k);
                return;
            }
            if (n.a()) {
                this.f26705c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        ArrayList arrayList = new ArrayList(bVar.h());
        arrayList.add(bVar.t0());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(a(((Uri) it.next()).getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (n.a()) {
            this.f26705c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f26704b.E().a(la.K, str, (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
        } catch (Throwable th) {
            if (n.a()) {
                this.f26705c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f26704b.E().a("FileManager", str, th);
        }
    }

    private long a() {
        long longValue = ((Long) this.f26704b.a(sj.V0)).longValue();
        if (longValue >= 0) {
            return longValue;
        }
        return -1L;
    }

    private long a(long j2) {
        return j2 / 1048576;
    }

    public boolean a(File file) {
        if (!yp.a(sj.f26931k1, this.f26704b)) {
            return (file == null || !file.exists() || file.isDirectory()) ? false : true;
        }
        if (file == null) {
            return false;
        }
        yp.a();
        c(file);
        boolean z2 = file.exists() && !file.isDirectory();
        g(file);
        return z2;
    }
}
