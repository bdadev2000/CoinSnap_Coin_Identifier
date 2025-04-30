package com.applovin.impl.sdk;

import Q7.n0;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentTransaction;
import com.applovin.impl.C0748s2;
import com.applovin.impl.L;
import com.applovin.impl.aa;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class p {
    private final k b;

    /* renamed from: c */
    private final t f11137c;

    /* renamed from: a */
    private final String f11136a = "FileManager";

    /* renamed from: d */
    private final Object f11138d = new Object();

    /* renamed from: e */
    private final Set f11139e = new HashSet();

    public p(k kVar) {
        this.b = kVar;
        this.f11137c = kVar.L();
    }

    private boolean f(File file) {
        if (t.a()) {
            this.f11137c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            boolean delete = file.delete();
            if (!delete) {
                this.b.B().a(o.b.FILE_ERROR, "removeFile", (Map) CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath()));
            }
            g(file);
            return delete;
        } catch (Throwable th) {
            try {
                if (t.a()) {
                    this.f11137c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.b.B().a("FileManager", "removeFile", th);
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
        synchronized (this.f11138d) {
            try {
                if (!this.f11139e.remove(absolutePath)) {
                    this.b.B().a(o.b.FILE_ERROR, "unlockFile", (Map) CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, absolutePath));
                }
                this.f11138d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.b.l0().a((xl) new kn(this.b, false, "removeCachedResourcesForAd", new H(this, bVar, context, 0)), sm.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.b.l0().a((xl) new kn(this.b, false, "removeCachedVideoResourceForAd", new H(this, bVar, context, 1)), sm.b.CACHING);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, java.io.Closeable] */
    public String e(File file) {
        Throwable th;
        InputStream inputStream;
        IOException e4;
        FileNotFoundException e9;
        if (file == null) {
            return null;
        }
        if (t.a()) {
            this.f11137c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        ?? booleanValue = ((Boolean) this.b.a(oj.f9629M)).booleanValue();
        boolean z8 = true;
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
                                            String a6 = a(fileInputStream);
                                            r7 = a6 == null;
                                            fileInputStream.close();
                                            if (r7 && ((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                                                a(file, "removeFileAfterReadFail");
                                            }
                                            g(file);
                                            return a6;
                                        } catch (Throwable th2) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e10) {
                                        if (t.a()) {
                                            this.f11137c.d("FileManager", "File not found. " + e10);
                                        }
                                        this.f11137c.a("FileManager", e10);
                                        this.b.B().a("FileManager", "readFileNotFound", e10);
                                        if (0 != 0 && ((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                                            a(file, "removeFileAfterReadFail");
                                        }
                                        g(file);
                                        return null;
                                    }
                                } catch (Throwable th4) {
                                    if (t.a()) {
                                        this.f11137c.a("FileManager", "Unknown failure to read file.", th4);
                                    }
                                    this.f11137c.a("FileManager", th4);
                                    this.b.B().a("FileManager", "readFile", th4);
                                    if (((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                                        a(file, "removeFileAfterReadFail");
                                    }
                                    g(file);
                                    return null;
                                }
                            } catch (IOException e11) {
                                if (t.a()) {
                                    this.f11137c.a("FileManager", "Failed to read file: " + file.getName() + e11);
                                }
                                this.f11137c.a("FileManager", e11);
                                this.b.B().a("FileManager", "readFileIO", e11);
                                if (((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            }
                        }
                        try {
                            c(file);
                            inputStream = new FileInputStream(file);
                        } catch (FileNotFoundException e12) {
                            e9 = e12;
                            inputStream = null;
                        } catch (IOException e13) {
                            e4 = e13;
                            inputStream = null;
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream = null;
                        }
                        try {
                            String a9 = a(inputStream);
                            r7 = a9 == null;
                            zp.a((Closeable) inputStream, this.b);
                            if (r7 && ((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return a9;
                        } catch (FileNotFoundException e14) {
                            e9 = e14;
                            if (t.a()) {
                                this.f11137c.d("FileManager", "File not found. " + e9);
                            }
                            this.b.B().a("FileManager", "readFileNotFound", e9);
                            zp.a((Closeable) inputStream, this.b);
                            g(file);
                            return null;
                        } catch (IOException e15) {
                            e4 = e15;
                            if (t.a()) {
                                this.f11137c.a("FileManager", "Failed to read file: " + file.getName() + e4);
                            }
                            this.b.B().a("FileManager", "readFileIO", e4);
                            zp.a((Closeable) inputStream, this.b);
                            if (((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        } catch (Throwable th6) {
                            th = th6;
                            if (t.a()) {
                                this.f11137c.a("FileManager", "Unknown failure to read file.", th);
                            }
                            this.b.B().a("FileManager", "readFile", th);
                            zp.a((Closeable) inputStream, this.b);
                            if (((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        zp.a((Closeable) booleanValue, this.b);
                        if (r7) {
                            a(file, "removeFileAfterReadFail");
                        }
                        g(file);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (z8) {
                        a(file, "removeFileAfterReadFail");
                    }
                    g(file);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                z8 = false;
                if (z8 && ((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                g(file);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            r7 = true;
            zp.a((Closeable) booleanValue, this.b);
            if (r7 && ((Boolean) this.b.a(oj.f9764g1)).booleanValue()) {
                a(file, "removeFileAfterReadFail");
            }
            g(file);
            throw th;
        }
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f11138d) {
            boolean add = this.f11139e.add(absolutePath);
            while (!add) {
                try {
                    this.f11138d.wait();
                    add = this.f11139e.add(absolutePath);
                } catch (InterruptedException e4) {
                    if (t.a()) {
                        this.f11137c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e4);
                    }
                    throw new RuntimeException(e4);
                }
            }
        }
    }

    private boolean d(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f11138d) {
            try {
                if (this.f11139e.contains(absolutePath)) {
                    return false;
                }
                c(file);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z8, C0748s2 c0748s2) {
        return a(context, str, str2, list, z8, false, c0748s2);
    }

    public void b(Context context) {
        if (this.b.A0()) {
            if (t.a()) {
                this.f11137c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z8, boolean z9, C0748s2 c0748s2) {
        if (!StringUtils.isValidString(str)) {
            if (t.a()) {
                this.f11137c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.b.B().a(o.b.FILE_ERROR, "cacheResource");
            return null;
        }
        String a6 = zp.a(Uri.parse(str), str2, this.b);
        File a9 = a(a6, context);
        if (!a(a9, str, list, z8, c0748s2)) {
            return null;
        }
        if (t.a()) {
            n0.s("Caching succeeded for file ", a6, this.f11137c, "FileManager");
        }
        return z9 ? Uri.fromFile(a9).toString() : a6;
    }

    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        f(a(bVar.s0().getLastPathSegment(), context));
    }

    private boolean b(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f11138d) {
            contains = this.f11139e.contains(absolutePath);
        }
        return contains;
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    private List c(Context context) {
        File[] listFiles;
        File d2 = d(context);
        if (d2.isDirectory() && (listFiles = d2.listFiles()) != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public boolean c(String str, Context context) {
        boolean z8 = false;
        File a6 = a(str, false, context);
        if (!d(a6)) {
            return false;
        }
        if (a6.exists() && !a6.isDirectory()) {
            z8 = true;
        }
        g(a6);
        return z8;
    }

    public boolean a(File file, String str, List list, C0748s2 c0748s2) {
        return a(file, str, list, true, c0748s2);
    }

    private boolean a(File file, String str, List list, boolean z8, C0748s2 c0748s2) {
        InputStream inputStream;
        if (a(file)) {
            if (t.a()) {
                n0.s("File exists for ", str, this.f11137c, "FileManager");
            }
            if (c0748s2 == null) {
                return true;
            }
            c0748s2.a(file.length());
            return true;
        }
        if (((Boolean) this.b.a(oj.f9629M)).booleanValue()) {
            try {
                InputStream a6 = a(str, list, z8, c0748s2);
                try {
                    boolean a9 = a(a6, file);
                    if (a6 != null) {
                        a6.close();
                    }
                    return a9;
                } finally {
                }
            } catch (Throwable th) {
                this.f11137c.a("FileManager", th);
                this.b.B().a("FileManager", "loadAndCacheResource", th);
                return false;
            }
        }
        try {
            inputStream = a(str, list, z8, c0748s2);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean a10 = a(inputStream, file);
            zp.a((Closeable) inputStream, this.b);
            return a10;
        } catch (Throwable th3) {
            th = th3;
            zp.a((Closeable) inputStream, this.b);
            throw th;
        }
    }

    public InputStream a(String str, List list, boolean z8, C0748s2 c0748s2) {
        HttpURLConnection httpURLConnection;
        if (z8 && !zp.a(str, list)) {
            if (t.a()) {
                n0.s("Domain is not whitelisted, skipping precache for url: ", str, this.f11137c, "FileManager");
            }
            return null;
        }
        if (((Boolean) this.b.a(oj.f9745d3)).booleanValue() && !str.contains("https://")) {
            if (t.a()) {
                this.f11137c.k("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (t.a()) {
            L.v("Loading ", str, "...", this.f11137c, "FileManager");
        }
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(((Integer) this.b.a(oj.f9730b3)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.b.a(oj.f9738c3)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            c0748s2.a(responseCode);
            this.b.B().a("loadResource", str, responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                if (t.a()) {
                    this.f11137c.a("FileManager", "Opened stream to resource " + str);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                if (((Boolean) this.b.a(oj.f9550A3)).booleanValue()) {
                    zp.a(httpURLConnection, this.b);
                }
                return inputStream;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            try {
                if (t.a()) {
                    this.f11137c.a("FileManager", "Error loading " + str, th);
                }
                this.b.B().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", str));
                c0748s2.a(th);
                if (((Boolean) this.b.a(oj.f9550A3)).booleanValue()) {
                    zp.a(httpURLConnection, this.b);
                }
                return null;
            } finally {
                if (((Boolean) this.b.a(oj.f9550A3)).booleanValue()) {
                    zp.a(httpURLConnection, this.b);
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
            if (t.a()) {
                this.f11137c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (t.a()) {
                this.f11137c.b("FileManager", "Failed to create .nomedia file");
            }
            this.b.B().a(o.b.FILE_ERROR, "createNoMediaFile");
        } catch (IOException e4) {
            if (t.a()) {
                this.f11137c.a("FileManager", "Failed to create .nomedia file", e4);
            }
        }
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z8, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (t.a()) {
                this.f11137c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (t.a()) {
            n0.s("Looking up cached resource: ", str, this.f11137c, "FileManager");
        }
        String replace = str.contains(RewardPlus.ICON) ? str.replace("/", "_").replace(".", "_") : str;
        File d2 = d(context);
        File file = new File(d2, replace);
        if (zp.a(oj.f9778i1, this.b)) {
            boolean z9 = file.length() == 0;
            boolean equals = str.equals(".nomedia");
            if (file.exists() && z9 && !equals) {
                this.b.B().a(o.b.FILE_ERROR, "removeEmptyCachedResource", (Map) CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath()));
                f(file);
            }
        }
        if (z8) {
            try {
                d2.mkdirs();
            } catch (Throwable th) {
                if (t.a()) {
                    this.f11137c.a("FileManager", "Unable to make cache directory at " + d2, th);
                }
                this.b.B().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    public String a(InputStream inputStream) {
        if (((Boolean) this.b.a(oj.f9629M)).booleanValue()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                    while (true) {
                        int read = inputStream.read(bArr, 0, FragmentTransaction.TRANSIT_EXIT_MASK);
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
                this.f11137c.a("FileManager", th);
                this.b.B().a("FileManager", "readInputStreamAsString", th);
                return null;
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
            while (true) {
                int read2 = inputStream.read(bArr2, 0, FragmentTransaction.TRANSIT_EXIT_MASK);
                if (read2 >= 0) {
                    try {
                        byteArrayOutputStream3.write(bArr2, 0, read2);
                    } catch (Throwable th2) {
                        zp.a((Closeable) byteArrayOutputStream3, this.b);
                        this.b.B().a("FileManager", "readInputStreamAsString", th2);
                        return null;
                    }
                } else {
                    return byteArrayOutputStream3.toString("UTF-8");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01e9 A[Catch: all -> 0x01ef, TRY_LEAVE, TryCatch #7 {all -> 0x01ef, blocks: (B:135:0x01e3, B:137:0x01e9), top: B:134:0x01e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7 A[Catch: all -> 0x00fd, TryCatch #14 {all -> 0x00fd, blocks: (B:47:0x00f1, B:49:0x00f7, B:50:0x0100), top: B:46:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.io.InputStream r17, java.io.File r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p.a(java.io.InputStream, java.io.File, boolean):boolean");
    }

    public boolean a(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (t.a()) {
            this.f11137c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file, false)) {
            if (t.a()) {
                this.f11137c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        }
        if (!t.a()) {
            return true;
        }
        this.f11137c.a("FileManager", "Caching completed for " + file);
        return true;
    }

    private long a(Context context) {
        long a6 = a();
        boolean z8 = a6 != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List c9 = this.b.c(oj.f9722a1);
        long j7 = 0;
        for (File file : c(context)) {
            if (z8 && !c9.contains(file.getName()) && !b(file) && seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) > a6) {
                if (t.a()) {
                    this.f11137c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                if (f(file)) {
                    this.b.F().c(aa.f6602j);
                }
            }
            j7 += file.length();
        }
        return j7;
    }

    private void a(long j7, Context context) {
        long intValue = ((Integer) this.b.a(oj.f9696W0)).intValue();
        if (intValue == -1) {
            if (t.a()) {
                this.f11137c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j7) > intValue) {
                if (t.a()) {
                    this.f11137c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    f((File) it.next());
                }
                this.b.F().c(aa.f6603k);
                return;
            }
            if (t.a()) {
                this.f11137c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        ArrayList arrayList = new ArrayList(bVar.i());
        arrayList.add(bVar.s0());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(a(((Uri) it.next()).getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (t.a()) {
            this.f11137c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            this.b.B().a(o.b.FILE_ERROR, str, (Map) CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath()));
        } catch (Throwable th) {
            if (t.a()) {
                this.f11137c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.b.B().a("FileManager", str, th);
        }
    }

    private long a() {
        long longValue = ((Long) this.b.a(oj.f9689V0)).longValue();
        if (longValue >= 0) {
            return longValue;
        }
        return -1L;
    }

    private long a(long j7) {
        return j7 / 1048576;
    }

    public boolean a(File file) {
        if (!zp.a(oj.l1, this.b)) {
            return (file == null || !file.exists() || file.isDirectory()) ? false : true;
        }
        if (file == null) {
            return false;
        }
        zp.a();
        c(file);
        boolean z8 = file.exists() && !file.isDirectory();
        g(file);
        return z8;
    }
}
