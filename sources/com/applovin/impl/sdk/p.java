package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.aa;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
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

    /* renamed from: b, reason: collision with root package name */
    private final k f7973b;

    /* renamed from: c, reason: collision with root package name */
    private final t f7974c;
    private final String a = "FileManager";

    /* renamed from: d, reason: collision with root package name */
    private final Object f7975d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set f7976e = new HashSet();

    public p(k kVar) {
        this.f7973b = kVar;
        this.f7974c = kVar.L();
    }

    private boolean f(File file) {
        if (t.a()) {
            this.f7974c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            boolean delete = file.delete();
            if (!delete) {
                this.f7973b.B().a(o.b.FILE_ERROR, "removeFile", (Map) CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath()));
            }
            return delete;
        } catch (Throwable th2) {
            try {
                if (t.a()) {
                    this.f7974c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th2);
                }
                this.f7973b.B().a("FileManager", "removeFile", th2);
                g(file);
                return false;
            } finally {
                g(file);
            }
        }
    }

    private void g(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f7975d) {
            if (!this.f7976e.remove(absolutePath)) {
                this.f7973b.B().a(o.b.FILE_ERROR, "unlockFile", (Map) CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, absolutePath));
            }
            this.f7975d.notifyAll();
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f7973b.l0().a((xl) new kn(this.f7973b, false, "removeCachedResourcesForAd", new i0(this, bVar, context, 1)), sm.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f7973b.l0().a((xl) new kn(this.f7973b, false, "removeCachedVideoResourceForAd", new i0(this, bVar, context, 0)), sm.b.CACHING);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable, boolean] */
    public String e(File file) {
        Throwable th2;
        InputStream inputStream;
        IOException e2;
        FileNotFoundException e10;
        if (file == null) {
            return null;
        }
        if (t.a()) {
            this.f7974c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        ?? booleanValue = ((Boolean) this.f7973b.a(oj.M)).booleanValue();
        boolean z10 = true;
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
                                            String a = a(fileInputStream);
                                            r7 = a == null;
                                            fileInputStream.close();
                                            if (r7 && ((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                                                a(file, "removeFileAfterReadFail");
                                            }
                                            g(file);
                                            return a;
                                        } catch (Throwable th3) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable th4) {
                                                th3.addSuppressed(th4);
                                            }
                                            throw th3;
                                        }
                                    } catch (Throwable th5) {
                                        if (t.a()) {
                                            this.f7974c.a("FileManager", "Unknown failure to read file.", th5);
                                        }
                                        this.f7974c.a("FileManager", th5);
                                        this.f7973b.B().a("FileManager", "readFile", th5);
                                        if (((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                                            a(file, "removeFileAfterReadFail");
                                        }
                                        g(file);
                                        return null;
                                    }
                                } catch (FileNotFoundException e11) {
                                    if (t.a()) {
                                        this.f7974c.d("FileManager", "File not found. " + e11);
                                    }
                                    this.f7974c.a("FileManager", e11);
                                    this.f7973b.B().a("FileManager", "readFileNotFound", e11);
                                    if (0 != 0 && ((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                                        a(file, "removeFileAfterReadFail");
                                    }
                                    g(file);
                                    return null;
                                }
                            } catch (IOException e12) {
                                if (t.a()) {
                                    this.f7974c.a("FileManager", "Failed to read file: " + file.getName() + e12);
                                }
                                this.f7974c.a("FileManager", e12);
                                this.f7973b.B().a("FileManager", "readFileIO", e12);
                                if (((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            }
                        }
                        try {
                            c(file);
                            inputStream = new FileInputStream(file);
                        } catch (FileNotFoundException e13) {
                            e10 = e13;
                            inputStream = null;
                        } catch (IOException e14) {
                            e2 = e14;
                            inputStream = null;
                        } catch (Throwable th6) {
                            th2 = th6;
                            inputStream = null;
                        }
                        try {
                            String a10 = a(inputStream);
                            r7 = a10 == null;
                            zp.a((Closeable) inputStream, this.f7973b);
                            if (r7 && ((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return a10;
                        } catch (FileNotFoundException e15) {
                            e10 = e15;
                            if (t.a()) {
                                this.f7974c.d("FileManager", "File not found. " + e10);
                            }
                            this.f7973b.B().a("FileManager", "readFileNotFound", e10);
                            zp.a((Closeable) inputStream, this.f7973b);
                            g(file);
                            return null;
                        } catch (IOException e16) {
                            e2 = e16;
                            if (t.a()) {
                                this.f7974c.a("FileManager", "Failed to read file: " + file.getName() + e2);
                            }
                            this.f7973b.B().a("FileManager", "readFileIO", e2);
                            zp.a((Closeable) inputStream, this.f7973b);
                            if (((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        } catch (Throwable th7) {
                            th2 = th7;
                            if (t.a()) {
                                this.f7974c.a("FileManager", "Unknown failure to read file.", th2);
                            }
                            this.f7973b.B().a("FileManager", "readFile", th2);
                            zp.a((Closeable) inputStream, this.f7973b);
                            if (((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        r7 = true;
                        zp.a((Closeable) booleanValue, this.f7973b);
                        if (r7) {
                            a(file, "removeFileAfterReadFail");
                        }
                        g(file);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    z10 = false;
                    if (z10) {
                        a(file, "removeFileAfterReadFail");
                    }
                    g(file);
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                if (z10 && ((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                g(file);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            zp.a((Closeable) booleanValue, this.f7973b);
            if (r7 && ((Boolean) this.f7973b.a(oj.f6658g1)).booleanValue()) {
                a(file, "removeFileAfterReadFail");
            }
            g(file);
            throw th;
        }
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f7975d) {
            boolean add = this.f7976e.add(absolutePath);
            while (!add) {
                try {
                    this.f7975d.wait();
                    add = this.f7976e.add(absolutePath);
                } catch (InterruptedException e2) {
                    if (t.a()) {
                        this.f7974c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e2);
                    }
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    private boolean d(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f7975d) {
            if (this.f7976e.contains(absolutePath)) {
                return false;
            }
            c(file);
            return true;
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z10, s2 s2Var) {
        return a(context, str, str2, list, z10, false, s2Var);
    }

    public void b(Context context) {
        if (this.f7973b.A0()) {
            if (t.a()) {
                this.f7974c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, s2 s2Var) {
        if (!StringUtils.isValidString(str)) {
            if (t.a()) {
                this.f7974c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f7973b.B().a(o.b.FILE_ERROR, "cacheResource");
            return null;
        }
        String a = zp.a(Uri.parse(str), str2, this.f7973b);
        File a10 = a(a, context);
        if (!a(a10, str, list, z10, s2Var)) {
            return null;
        }
        if (t.a()) {
            a4.j.v("Caching succeeded for file ", a, this.f7974c, "FileManager");
        }
        return z11 ? Uri.fromFile(a10).toString() : a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        f(a(bVar.s0().getLastPathSegment(), context));
    }

    private boolean b(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f7975d) {
            contains = this.f7976e.contains(absolutePath);
        }
        return contains;
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    private List c(Context context) {
        File[] listFiles;
        File d10 = d(context);
        if (d10.isDirectory() && (listFiles = d10.listFiles()) != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public boolean c(String str, Context context) {
        boolean z10 = false;
        File a = a(str, false, context);
        if (!d(a)) {
            return false;
        }
        if (a.exists() && !a.isDirectory()) {
            z10 = true;
        }
        g(a);
        return z10;
    }

    public boolean a(File file, String str, List list, s2 s2Var) {
        return a(file, str, list, true, s2Var);
    }

    private boolean a(File file, String str, List list, boolean z10, s2 s2Var) {
        InputStream inputStream;
        if (a(file)) {
            if (t.a()) {
                a4.j.v("File exists for ", str, this.f7974c, "FileManager");
            }
            if (s2Var == null) {
                return true;
            }
            s2Var.a(file.length());
            return true;
        }
        if (((Boolean) this.f7973b.a(oj.M)).booleanValue()) {
            try {
                InputStream a = a(str, list, z10, s2Var);
                try {
                    boolean a10 = a(a, file);
                    if (a != null) {
                        a.close();
                    }
                    return a10;
                } finally {
                }
            } catch (Throwable th2) {
                this.f7974c.a("FileManager", th2);
                this.f7973b.B().a("FileManager", "loadAndCacheResource", th2);
                return false;
            }
        }
        try {
            inputStream = a(str, list, z10, s2Var);
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        try {
            boolean a11 = a(inputStream, file);
            zp.a((Closeable) inputStream, this.f7973b);
            return a11;
        } catch (Throwable th4) {
            th = th4;
            zp.a((Closeable) inputStream, this.f7973b);
            throw th;
        }
    }

    public InputStream a(String str, List list, boolean z10, s2 s2Var) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        if (z10 && !zp.a(str, list)) {
            if (t.a()) {
                a4.j.v("Domain is not whitelisted, skipping precache for url: ", str, this.f7974c, "FileManager");
            }
            return null;
        }
        if (((Boolean) this.f7973b.a(oj.f6638d3)).booleanValue() && !str.contains("https://")) {
            if (t.a()) {
                this.f7974c.k("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (t.a()) {
            a4.j.x("Loading ", str, "...", this.f7974c, "FileManager");
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th3) {
            th2 = th3;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(((Integer) this.f7973b.a(oj.b3)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.f7973b.a(oj.f6630c3)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            s2Var.a(responseCode);
            this.f7973b.B().a("loadResource", str, responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                if (t.a()) {
                    this.f7974c.a("FileManager", "Opened stream to resource " + str);
                }
                return httpURLConnection.getInputStream();
            }
            if (((Boolean) this.f7973b.a(oj.A3)).booleanValue()) {
                zp.a(httpURLConnection, this.f7973b);
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            try {
                if (t.a()) {
                    this.f7974c.a("FileManager", "Error loading " + str, th2);
                }
                this.f7973b.B().a("FileManager", "loadResource", th2, CollectionUtils.hashMap("url", str));
                s2Var.a(th2);
                if (((Boolean) this.f7973b.a(oj.A3)).booleanValue()) {
                    zp.a(httpURLConnection, this.f7973b);
                }
                return null;
            } finally {
                if (((Boolean) this.f7973b.a(oj.A3)).booleanValue()) {
                    zp.a(httpURLConnection, this.f7973b);
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
                this.f7974c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (t.a()) {
                this.f7974c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f7973b.B().a(o.b.FILE_ERROR, "createNoMediaFile");
        } catch (IOException e2) {
            if (t.a()) {
                this.f7974c.a("FileManager", "Failed to create .nomedia file", e2);
            }
        }
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (t.a()) {
                this.f7974c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (t.a()) {
            a4.j.v("Looking up cached resource: ", str, this.f7974c, "FileManager");
        }
        String replace = str.contains(RewardPlus.ICON) ? str.replace("/", "_").replace(".", "_") : str;
        File d10 = d(context);
        File file = new File(d10, replace);
        if (zp.a(oj.f6674i1, this.f7973b)) {
            boolean z11 = file.length() == 0;
            boolean equals = str.equals(".nomedia");
            if (file.exists() && z11 && !equals) {
                this.f7973b.B().a(o.b.FILE_ERROR, "removeEmptyCachedResource", (Map) CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath()));
                f(file);
            }
        }
        if (z10) {
            try {
                d10.mkdirs();
            } catch (Throwable th2) {
                if (t.a()) {
                    this.f7974c.a("FileManager", "Unable to make cache directory at " + d10, th2);
                }
                this.f7973b.B().a("FileManager", "createCacheDir", th2);
                return null;
            }
        }
        return file;
    }

    public String a(InputStream inputStream) {
        if (((Boolean) this.f7973b.a(oj.M)).booleanValue()) {
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
            } catch (Throwable th2) {
                this.f7974c.a("FileManager", th2);
                this.f7973b.B().a("FileManager", "readInputStreamAsString", th2);
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
                    } catch (Throwable th3) {
                        zp.a((Closeable) byteArrayOutputStream3, this.f7973b);
                        this.f7973b.B().a("FileManager", "readInputStreamAsString", th3);
                        return null;
                    }
                } else {
                    return byteArrayOutputStream3.toString("UTF-8");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01e2 A[Catch: all -> 0x020a, TRY_LEAVE, TryCatch #4 {all -> 0x020a, blocks: (B:134:0x01dc, B:136:0x01e2), top: B:133:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5 A[Catch: all -> 0x011c, TryCatch #14 {all -> 0x011c, blocks: (B:47:0x00ef, B:49:0x00f5, B:50:0x00fa), top: B:46:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.io.InputStream r17, java.io.File r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p.a(java.io.InputStream, java.io.File, boolean):boolean");
    }

    public boolean a(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (t.a()) {
            this.f7974c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file, false)) {
            if (t.a()) {
                this.f7974c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        }
        if (!t.a()) {
            return true;
        }
        this.f7974c.a("FileManager", "Caching completed for " + file);
        return true;
    }

    private long a(Context context) {
        long a = a();
        boolean z10 = a != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List c10 = this.f7973b.c(oj.f6614a1);
        long j3 = 0;
        for (File file : c(context)) {
            if (z10 && !c10.contains(file.getName()) && !b(file) && seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) > a) {
                if (t.a()) {
                    this.f7974c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                if (f(file)) {
                    this.f7973b.F().c(aa.f3620j);
                }
            }
            j3 += file.length();
        }
        return j3;
    }

    private void a(long j3, Context context) {
        long intValue = ((Integer) this.f7973b.a(oj.W0)).intValue();
        if (intValue == -1) {
            if (t.a()) {
                this.f7974c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j3) > intValue) {
                if (t.a()) {
                    this.f7974c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    f((File) it.next());
                }
                this.f7973b.F().c(aa.f3621k);
                return;
            }
            if (t.a()) {
                this.f7974c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
            this.f7974c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f7973b.B().a(o.b.FILE_ERROR, str, (Map) CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath()));
        } catch (Throwable th2) {
            if (t.a()) {
                this.f7974c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th2);
            }
            this.f7973b.B().a("FileManager", str, th2);
        }
    }

    private long a() {
        long longValue = ((Long) this.f7973b.a(oj.V0)).longValue();
        if (longValue >= 0) {
            return longValue;
        }
        return -1L;
    }

    private long a(long j3) {
        return j3 / 1048576;
    }

    public boolean a(File file) {
        if (!zp.a(oj.f6697l1, this.f7973b)) {
            return (file == null || !file.exists() || file.isDirectory()) ? false : true;
        }
        if (file == null) {
            return false;
        }
        zp.a();
        c(file);
        boolean z10 = file.exists() && !file.isDirectory();
        g(file);
        return z10;
    }
}
