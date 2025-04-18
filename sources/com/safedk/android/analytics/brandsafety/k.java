package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class k {
    private static final String A = "AWSAccessKeyId";
    private static final String B = "acl";
    private static final String C = "x-amz-server-side-encryption";
    private static final String D = "x-amz-algorithm";
    private static final String E = "x-amz-credential";
    private static final String F = "policy";
    private static final String G = "s3_key_prefix";
    private static final String H = "image_id";
    private static final String I = "Content-Type";
    private static final String J = ".jpg";
    private static k K = null;
    private static final Object L = new Object();

    /* renamed from: a, reason: collision with root package name */
    public static final String f29696a = "original_url";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29697b = "resolved_url";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29698c = "fingerprint";
    public static final String d = "sdk_uuid";
    public static final String e = "impression_id";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29699f = "package";

    /* renamed from: g, reason: collision with root package name */
    private static final String f29700g = "ImageUploadManager";

    /* renamed from: h, reason: collision with root package name */
    private static final String f29701h = "type";

    /* renamed from: i, reason: collision with root package name */
    private static final String f29702i = "hash";

    /* renamed from: j, reason: collision with root package name */
    private static final String f29703j = "sdk";

    /* renamed from: k, reason: collision with root package name */
    private static final String f29704k = "keys";

    /* renamed from: l, reason: collision with root package name */
    private static final String f29705l = "images_to_upload";

    /* renamed from: m, reason: collision with root package name */
    private static final String f29706m = "images_to_discard";

    /* renamed from: n, reason: collision with root package name */
    private static final String f29707n = "s3_access_tokens";

    /* renamed from: o, reason: collision with root package name */
    private static final String f29708o = "resolve_urls";

    /* renamed from: p, reason: collision with root package name */
    private static final String f29709p = "url";

    /* renamed from: q, reason: collision with root package name */
    private static final String f29710q = "key_prefix";

    /* renamed from: r, reason: collision with root package name */
    private static final String f29711r = "key";

    /* renamed from: s, reason: collision with root package name */
    private static final String f29712s = "gcs_params";

    /* renamed from: t, reason: collision with root package name */
    private static final String f29713t = "headers";

    /* renamed from: u, reason: collision with root package name */
    private static final String f29714u = "upload_url";

    /* renamed from: v, reason: collision with root package name */
    private static final String f29715v = "base_url";
    private static final String w = "attributes";
    private static final String x = "bucket";

    /* renamed from: y, reason: collision with root package name */
    private static final String f29716y = "x-amz-date";

    /* renamed from: z, reason: collision with root package name */
    private static final String f29717z = "signature";

    private k() {
        b();
    }

    private void b() {
        AppLovinBridge.registerListener(AppLovinBridge.f29082b, new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.k.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(k.f29700g, "Response received");
                k.this.b(bundle);
            }
        });
    }

    private a a(Bundle bundle) {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        com.safedk.android.utils.k.b(f29700g, "Extract AWS upload parameters from response body: " + bundle);
        if (bundle.containsKey(f29707n)) {
            Bundle bundle2 = bundle.getBundle(f29707n);
            Logger.d(f29700g, "s3AccessTokens=" + bundle2.toString());
            str = bundle2.getString(f29715v);
            Bundle bundle3 = bundle2.getBundle(w);
            str2 = bundle3.getString(x);
            str3 = bundle3.getString(f29716y);
            str4 = bundle3.getString(f29717z);
            str5 = bundle3.getString(A);
            str6 = bundle3.getString(B);
            str7 = bundle3.getString(C);
            str8 = bundle3.getString(D);
            str9 = bundle3.getString(E);
            str10 = bundle3.getString(F);
            str11 = bundle3.getString("Content-Type");
            Logger.d(f29700g, "s3 credentials collected");
        }
        return new a(str5, str10, str4, null, str2, str, str5, str6, str8, str3, str7, str9, str11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bundle bundle) {
        a a2;
        try {
            Logger.d(f29700g, "Response from server: " + bundle.toString());
            ArrayList arrayList = new ArrayList();
            if (bundle.containsKey(f29705l)) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(f29705l);
                Logger.d(f29700g, "imagesToUploadArrayList=" + stringArrayList.toString());
                int i2 = 0;
                a aVar = null;
                while (i2 < stringArrayList.size()) {
                    Bundle bundle2 = (Bundle) stringArrayList.get(i2);
                    String string = bundle2.getString(f29698c);
                    String string2 = bundle2.getString("image_id");
                    b bVar = null;
                    if (bundle2.containsKey(f29712s)) {
                        String string3 = bundle2.getString(f29710q);
                        String string4 = bundle2.getString("key");
                        Bundle bundle3 = bundle2.getBundle(f29712s);
                        bVar = new b(string3, string4, bundle3.getBundle(f29713t), bundle3.getString(f29714u));
                        a2 = aVar;
                    } else {
                        a2 = aVar == null ? a(bundle) : aVar;
                    }
                    if (a2 != null) {
                        String string5 = bundle2.getString(G);
                        a2.a(string5);
                        Logger.d(f29700g, "imagesToUploadBundle item : fingerprint=" + string + ", imageId=" + string2 + ", s3KeyPrefix=" + string5);
                    }
                    com.safedk.android.analytics.brandsafety.c h2 = com.safedk.android.analytics.brandsafety.b.h(string2);
                    if (h2 != null) {
                        Logger.d(f29700g, "Image for upload added : image id " + string2);
                        arrayList.add(new c(h2.f29382p, string2, string, bVar, a2));
                    }
                    i2++;
                    aVar = a2;
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    c cVar = (c) arrayList.get(i3);
                    if (cVar.f29734a != null) {
                        com.safedk.android.analytics.brandsafety.a a3 = SafeDK.getInstance().a(cVar.f29734a);
                        if (a3 != null) {
                            Logger.d(f29700g, "Executing image upload request for ad type " + cVar.f29734a.name());
                            a3.a(cVar.e, cVar.d, cVar.f29735b, cVar.f29736c);
                        } else {
                            Logger.d(f29700g, "Upload: finder not found for ad type " + cVar.f29734a.name());
                        }
                    } else {
                        Logger.d(f29700g, "Upload: finder not found for ad type null");
                    }
                }
            }
            if (bundle.containsKey(f29708o)) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(f29708o);
                Logger.d(f29700g, "clickUrlsToResolveArrayList=" + stringArrayList2.toString());
                for (int i4 = 0; i4 < stringArrayList2.size(); i4++) {
                    Bundle bundle4 = (Bundle) stringArrayList2.get(i4);
                    String string6 = bundle4.getString(f29698c);
                    String string7 = bundle4.getString("sdk_uuid");
                    String string8 = bundle4.getString("impression_id");
                    String string9 = bundle4.getString("url");
                    Logger.d(f29700g, "clickUrlsToResolveBundle item : fingerprint=" + string6 + ", url=" + string9);
                    if (string6 != null && string9 != null) {
                        i.a().a(string9, string6, string7, string8);
                    } else {
                        Logger.d(f29700g, "fingerprint and url are null, skipping");
                    }
                }
            }
            if (bundle.containsKey(f29706m)) {
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList(f29706m);
                Logger.d(f29700g, "Images to discard : " + stringArrayList3.toString());
                Iterator<String> it = stringArrayList3.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    com.safedk.android.analytics.brandsafety.c h3 = com.safedk.android.analytics.brandsafety.b.h(next);
                    if (h3 != null) {
                        com.safedk.android.analytics.brandsafety.a a4 = SafeDK.getInstance().a(h3.f29382p);
                        if (a4 != null) {
                            Logger.d(f29700g, "Executing image discard request for hash " + next);
                            a4.d(next);
                        } else {
                            Logger.d(f29700g, "Discard : finder not found for image id " + next);
                        }
                    }
                }
            }
            if (bundle.isEmpty() || !bundle.containsKey(f29705l)) {
                c();
            }
        } catch (Throwable th) {
            Logger.e(f29700g, "Failed to handle response from server", th);
            new CrashReporter().caughtException(th);
        }
    }

    private void c() {
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
        while (it.hasNext()) {
            it.next().b((l) null);
        }
    }

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (K == null) {
                K = new k();
            }
            kVar = K;
        }
        return kVar;
    }

    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        String f29731a;

        /* renamed from: b, reason: collision with root package name */
        String f29732b;

        /* renamed from: c, reason: collision with root package name */
        Bundle f29733c;
        String d;

        public b(String str, String str2, Bundle bundle, String str3) {
            this.f29731a = str;
            this.f29732b = str2;
            this.f29733c = bundle;
            this.d = str3;
            Logger.d(k.f29700g, "GcsUploadParams ctor, keyPrefix=" + str + ", key=" + str2 + ", headers=" + bundle + ", uploadUrl=" + str3);
        }

        public String a() {
            return this.f29731a;
        }

        public String b() {
            return this.f29732b;
        }

        public Bundle c() {
            return this.f29733c;
        }

        public String d() {
            return this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("keyPrefix=").append(this.f29731a).append(", key = ").append(this.f29732b).append(", headers=").append(this.f29733c).append(", uploadUrl=").append(this.d);
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f29719a;

        /* renamed from: b, reason: collision with root package name */
        String f29720b;

        /* renamed from: c, reason: collision with root package name */
        String f29721c;
        String d;
        String e;

        /* renamed from: f, reason: collision with root package name */
        String f29722f;

        /* renamed from: g, reason: collision with root package name */
        String f29723g;

        /* renamed from: h, reason: collision with root package name */
        String f29724h;

        /* renamed from: i, reason: collision with root package name */
        String f29725i;

        /* renamed from: j, reason: collision with root package name */
        String f29726j;

        /* renamed from: k, reason: collision with root package name */
        String f29727k;

        /* renamed from: l, reason: collision with root package name */
        String f29728l;

        /* renamed from: m, reason: collision with root package name */
        String f29729m;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.f29719a = str;
            this.f29720b = str2;
            this.f29721c = str3;
            this.d = str4;
            this.e = str5;
            this.f29722f = str6;
            this.f29723g = str7;
            this.f29724h = str8;
            this.f29725i = str9;
            this.f29726j = str10;
            this.f29727k = str11;
            this.f29728l = str12;
            this.f29729m = str13;
            Logger.d(k.f29700g, "AwsUploadParams ctor, awsAccessKey=" + str + ", keyPrefix=" + str4 + ", bucket=" + str5);
        }

        public String a() {
            return this.f29719a;
        }

        public String b() {
            return this.f29720b;
        }

        public String c() {
            return this.f29721c;
        }

        public String d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return this.f29722f;
        }

        public String g() {
            return this.f29724h;
        }

        public String h() {
            return this.f29725i;
        }

        public String i() {
            return this.f29726j;
        }

        public String j() {
            return this.f29727k;
        }

        public String k() {
            return this.f29728l;
        }

        public void a(String str) {
            this.d = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BaseUrl=" + this.f29722f + ", keyPrefix = " + this.d);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        BrandSafetyUtils.AdType f29734a;

        /* renamed from: b, reason: collision with root package name */
        String f29735b;

        /* renamed from: c, reason: collision with root package name */
        String f29736c;
        a d;
        b e;

        c(BrandSafetyUtils.AdType adType, String str, String str2, b bVar, a aVar) {
            this.f29734a = adType;
            this.f29735b = str;
            this.f29736c = str2;
            this.e = bVar;
            this.d = aVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object compareTo) {
            return this.f29734a.ordinal() - ((c) compareTo).f29734a.ordinal();
        }
    }
}
