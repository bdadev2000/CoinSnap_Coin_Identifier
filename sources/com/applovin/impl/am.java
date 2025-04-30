package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import c7.C0665z;
import com.applovin.impl.C0684d1;
import com.applovin.impl.C0689e1;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.ue;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class am extends xl implements ue.a {

    /* renamed from: h */
    protected final com.applovin.impl.sdk.ad.b f6754h;

    /* renamed from: i */
    protected final C0748s2 f6755i;

    /* renamed from: j */
    private AppLovinAdLoadListener f6756j;

    /* renamed from: k */
    private final com.applovin.impl.sdk.p f6757k;
    private final Collection l;
    private boolean m;

    /* renamed from: n */
    protected ExecutorService f6758n;

    /* renamed from: o */
    protected ExecutorService f6759o;

    /* renamed from: p */
    protected List f6760p;

    /* renamed from: q */
    protected String f6761q;

    /* loaded from: classes.dex */
    public class a implements C0689e1.a {
        public a() {
        }

        @Override // com.applovin.impl.C0689e1.a
        public void a(Uri uri) {
            am.this.f6754h.b(uri);
            com.applovin.impl.sdk.t tVar = am.this.f12279c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar = am.this;
                amVar.f12279c.a(amVar.b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements C0689e1.a {
        public b() {
        }

        @Override // com.applovin.impl.C0689e1.a
        public void a(Uri uri) {
            am.this.f6754h.c(uri);
            com.applovin.impl.sdk.t tVar = am.this.f12279c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar = am.this;
                amVar.f12279c.a(amVar.b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements C0689e1.a {

        /* renamed from: a */
        final /* synthetic */ C0689e1.a f6764a;

        public c(C0689e1.a aVar) {
            this.f6764a = aVar;
        }

        @Override // com.applovin.impl.C0689e1.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.t tVar = am.this.f12279c;
                if (com.applovin.impl.sdk.t.a()) {
                    am amVar = am.this;
                    amVar.f12279c.a(amVar.b, "Finish caching video for ad #" + am.this.f6754h.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
                }
                this.f6764a.a(uri);
                return;
            }
            com.applovin.impl.sdk.t tVar2 = am.this.f12279c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar2 = am.this;
                amVar2.f12279c.b(amVar2.b, "Failed to cache video");
            }
            am.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        }
    }

    /* loaded from: classes.dex */
    public class d implements C0684d1.c {

        /* renamed from: a */
        final /* synthetic */ e f6765a;

        public d(e eVar) {
            this.f6765a = eVar;
        }

        @Override // com.applovin.impl.C0684d1.c
        public void a(String str, boolean z8) {
            if (z8) {
                am.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f6765a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String str);
    }

    public am(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        String uuid;
        if (bVar != null) {
            this.f6754h = bVar;
            this.f6756j = appLovinAdLoadListener;
            this.f6757k = kVar.D();
            this.l = h();
            this.f6755i = new C0748s2();
            if (((Boolean) kVar.a(oj.f9736c1)).booleanValue()) {
                if (StringUtils.isValidString(bVar.H())) {
                    uuid = bVar.H();
                } else {
                    uuid = UUID.randomUUID().toString();
                }
                this.f6761q = uuid;
                this.f6758n = kVar.l0().a("com.applovin.sdk.caching." + this.f6761q, ((Integer) kVar.a(oj.f9744d1)).intValue());
                this.f6759o = kVar.l0().a("com.applovin.sdk.caching.html." + this.f6761q, ((Integer) kVar.a(oj.f9750e1)).intValue());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c9 : ((String) this.f12278a.a(oj.f9702X0)).toCharArray()) {
            hashSet.add(Character.valueOf(c9));
        }
        hashSet.add('\"');
        return hashSet;
    }

    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f6756j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f6754h);
            this.f6756j = null;
        }
    }

    public List a(List list) {
        this.f6760p = list;
        return this.f12278a.l0().a(list, this.f6758n);
    }

    public Uri b(String str) {
        return a(str, this.f6754h.X(), true);
    }

    public Uri c(String str) {
        return c(str, this.f6754h.X(), true);
    }

    public String d(String str, List list, boolean z8) {
        if (((Boolean) this.f12278a.a(oj.f9629M)).booleanValue()) {
            try {
                InputStream a6 = this.f6757k.a(str, list, z8, this.f6755i);
                if (a6 == null) {
                    if (a6 != null) {
                        a6.close();
                    }
                    return null;
                }
                try {
                    String a9 = this.f6757k.a(a6);
                    a6.close();
                    return a9;
                } finally {
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Unknown failure to read input stream.", th);
                }
                this.f12279c.a(this.b, th);
                this.f12278a.B().a(this.b, "readInputStreamAsString", th);
                return null;
            }
        }
        InputStream a10 = this.f6757k.a(str, list, z8, this.f6755i);
        if (a10 == null) {
            return null;
        }
        try {
            String a11 = this.f6757k.a(a10);
            zp.a((Closeable) a10, this.f12278a);
            return a11;
        } catch (Throwable th2) {
            try {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Unknown failure to read input stream.", th2);
                }
                this.f12278a.B().a(this.b, "readInputStreamAsString", th2);
                zp.a((Closeable) a10, this.f12278a);
                return null;
            } catch (Throwable th3) {
                zp.a((Closeable) a10, this.f12278a);
                throw th3;
            }
        }
    }

    public void f() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Rendered new ad:" + this.f6754h);
        }
        AppLovinSdkUtils.runOnUiThread(new F0(this, 6));
    }

    public void g() {
        this.m = true;
        List list = this.f6760p;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f6760p.iterator();
            while (it.hasNext()) {
                ((AbstractCallableC0679c1) it.next()).a(true);
            }
        }
        ExecutorService executorService = this.f6758n;
        if (executorService != null) {
            executorService.shutdown();
            this.f6758n = null;
        }
        ExecutorService executorService2 = this.f6759o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f6759o = null;
        }
    }

    public void j() {
        if (x3.f()) {
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Caching mute images...");
        }
        Uri a6 = a(this.f6754h.L(), CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (a6 != null) {
            this.f6754h.b(a6);
        }
        Uri a9 = a(this.f6754h.e0(), CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        if (a9 != null) {
            this.f6754h.c(a9);
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Ad updated with muteImageFilename = " + this.f6754h.L() + ", unmuteImageFilename = " + this.f6754h.e0());
        }
    }

    public void k() {
        this.f12278a.U().b(this);
        ExecutorService executorService = this.f6758n;
        if (executorService != null) {
            executorService.shutdown();
            this.f6758n = null;
        }
        ExecutorService executorService2 = this.f6759o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f6759o = null;
        }
    }

    public boolean l() {
        return this.m;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6754h.a1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Subscribing to timeout events...");
            }
            this.f12278a.U().a(this);
        }
    }

    public String b(String str, List list, boolean z8) {
        InputStream inputStream;
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Nothing to cache, skipping...");
                }
                return null;
            }
            try {
                File a6 = this.f6757k.a(zp.a(parse, this.f6754h.getCachePrefix(), this.f12278a), a());
                if (!this.f6757k.a(a6)) {
                    if (((Boolean) this.f12278a.a(oj.f9629M)).booleanValue()) {
                        try {
                            InputStream a9 = this.f6757k.a(str, list, z8, this.f6755i);
                            try {
                                if (a9 != null) {
                                    this.f6757k.a(a9, a6);
                                } else {
                                    if (com.applovin.impl.sdk.t.a()) {
                                        this.f12279c.b(this.b, "Failed to load resource: " + str);
                                    }
                                    this.f12278a.B().a(o.b.CACHE_ERROR, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                                }
                                if (a9 != null) {
                                    a9.close();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            this.f12279c.a(this.b, th);
                            this.f12278a.B().a(this.b, "cacheStringResource", th);
                        }
                    } else {
                        try {
                            inputStream = this.f6757k.a(str, list, z8, this.f6755i);
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = null;
                        }
                        try {
                            if (inputStream != null) {
                                this.f6757k.a(inputStream, a6);
                            } else {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f12279c.b(this.b, "Failed to load resource: " + str);
                                }
                                this.f12278a.B().a(o.b.CACHE_ERROR, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                            }
                            zp.a((Closeable) inputStream, this.f12278a);
                        } catch (Throwable th3) {
                            th = th3;
                            zp.a((Closeable) inputStream, this.f12278a);
                            throw th;
                        }
                    }
                }
                return this.f6757k.e(a6);
            } catch (Throwable th4) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, AbstractC2914a.e("Resource at ", str, " failed to load."), th4);
                }
            }
        }
        return null;
    }

    public Uri c(String str, List list, boolean z8) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            L.v("Caching video ", str, "...", this.f12279c, this.b);
        }
        String a6 = this.f6757k.a(a(), str, this.f6754h.getCachePrefix(), list, z8, this.f6755i);
        if (StringUtils.isValidString(a6)) {
            File a9 = this.f6757k.a(a6, a());
            if (a9 != null) {
                Uri fromFile = Uri.fromFile(a9);
                if (fromFile != null) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f12279c.a(this.b, "Finish caching video for ad #" + this.f6754h.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a6);
                    }
                    return fromFile;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "Unable to create URI from cached video file = " + a9);
                }
                this.f12278a.B().a(o.b.CACHE_ERROR, "extractUriFromVideoFile", (Map) CollectionUtils.hashMap("url", a6));
                return null;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to retrieve File from cached video filename = " + a6);
            }
            this.f12278a.B().a(o.b.CACHE_ERROR, "retrieveVideoFile", (Map) CollectionUtils.hashMap("url", a6));
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Failed to cache video: " + str);
        }
        this.f12278a.B().a(o.b.CACHE_ERROR, "cacheVideo", (Map) CollectionUtils.hashMap("url", str));
        a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        return null;
    }

    public List e() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f6754h.L() != null) {
            arrayList.add(a(this.f6754h.L().toString(), new a()));
        }
        if (this.f6754h.e0() != null) {
            arrayList.add(a(this.f6754h.e0().toString(), new b()));
        }
        return arrayList;
    }

    private Uri a(String str, String str2) {
        File a6 = this.f6757k.a(zp.a(Uri.parse(str2), this.f6754h.getCachePrefix(), this.f12278a), com.applovin.impl.sdk.k.k());
        if (a6 == null) {
            return null;
        }
        if (this.f6757k.a(a6)) {
            this.f6755i.a(a6.length());
            return Uri.parse(C0665z.FILE_SCHEME + a6.getAbsolutePath());
        }
        if (!this.f6757k.a(a6, com.mbridge.msdk.foundation.entity.o.j(str, str2), Arrays.asList(str), this.f6755i)) {
            return null;
        }
        return Uri.parse(C0665z.FILE_SCHEME + a6.getAbsolutePath());
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r13, java.util.List r14, com.applovin.impl.sdk.ad.b r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.am.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    public C0689e1 b(String str, C0689e1.a aVar) {
        return a(str, this.f6754h.X(), true, aVar);
    }

    public Uri a(String str, List list, boolean z8) {
        try {
            String a6 = this.f6757k.a(a(), str, this.f6754h.getCachePrefix(), list, z8, this.f6755i);
            if (StringUtils.isValidString(a6)) {
                File a9 = this.f6757k.a(a6, a());
                if (a9 != null) {
                    Uri fromFile = Uri.fromFile(a9);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f12279c.b(this.b, "Unable to extract Uri from image file");
                    }
                    this.f12278a.B().a(o.b.CACHE_ERROR, "extractUriFromImageFile", (Map) CollectionUtils.hashMap("url", a6));
                    return null;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "Unable to retrieve File from cached image filename = " + a6);
                }
                this.f12278a.B().a(o.b.CACHE_ERROR, "retrieveImageFile", (Map) CollectionUtils.hashMap("url", a6));
                return null;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Failed to cache image: " + str);
            }
            this.f12278a.B().a(o.b.CACHE_ERROR, "cacheImageResource", (Map) CollectionUtils.hashMap("url", str));
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Failed to cache image at url = " + str, th);
            }
            this.f12278a.B().a(this.b, "cacheImageResource", th, CollectionUtils.hashMap("url", str));
            return null;
        }
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.t.a()) {
                L.v("No ", str, " image to cache", this.f12279c, this.b);
            }
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            if (com.applovin.impl.sdk.t.a()) {
                L.v("Failed to cache ", str, " image", this.f12279c, this.b);
            }
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            L.v("Caching ", str, " image...", this.f12279c, this.b);
        }
        return b(uri2);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String a6 = a(bVar.g0(), bVar.h0(), bVar.N0(), bVar.X(), bVar.X0());
        if (bVar.M0() && StringUtils.isValidString(a6)) {
            String a9 = a(a6, bVar.X(), bVar);
            bVar.a(a9);
            this.f12279c.f(this.b, "Ad updated with video button HTML assets cached = " + a9);
        }
    }

    public C0689e1 a(String str, List list, boolean z8, C0689e1.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.f12279c.a(this.b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            L.v("Caching video ", str, "...", this.f12279c, this.b);
        }
        return new C0689e1(str, this.f6754h, list, z8, this.f6755i, this.f12278a, new c(aVar));
    }

    public void a(int i9) {
        if (this.f6756j != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Calling back ad load failed with error code: " + i9);
            }
            this.f6756j.failedToReceiveAd(i9);
            this.f6756j = null;
        }
        g();
    }

    @Override // com.applovin.impl.ue.a
    public void a(be beVar) {
        if (beVar.Q().equalsIgnoreCase(this.f6754h.H())) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Updating flag for timeout...");
            }
            g();
        }
        this.f12278a.U().b(this);
    }

    public String a(String str, String str2, boolean z8, List list, boolean z9) {
        if (StringUtils.isValidString(str2)) {
            String a6 = a(str2, z8, list, z9);
            if (StringUtils.isValidString(a6)) {
                return a6;
            }
            if (TextUtils.isEmpty(str)) {
                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.b(this.b, "Could not retrieve HTML from: " + str2 + " and HTML source is invalid.");
                }
                this.f12278a.B().a(o.b.CACHE_ERROR, "retrieveHtmlString", (Map) CollectionUtils.hashMap("url", str2));
            }
        }
        return str;
    }

    private String a(String str, boolean z8, List list, boolean z9) {
        if (z8) {
            return b(str, list, z9);
        }
        return d(str, list, z9);
    }

    public C0689e1 a(String str, C0689e1.a aVar) {
        return new C0689e1(str, this.f6754h, this.f6755i, this.f12278a, aVar);
    }

    public C0684d1 a(String str, List list, e eVar) {
        return new C0684d1(str, this.f6754h, list, this.f6755i, this.f6759o, this.f12278a, new d(eVar));
    }
}
