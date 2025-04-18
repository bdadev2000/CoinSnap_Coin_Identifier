package com.safedk.android.a;

import android.os.Bundle;
import com.facebook.share.internal.ShareInternalUtility;
import com.safedk.android.a.g;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class c extends g {

    /* renamed from: a, reason: collision with root package name */
    k.b f29065a;

    public c(String str, String str2, int i2, k.b bVar) {
        super(str, str2, i2);
        this.f29065a = bVar;
        this.f29075b = "GCSUploadImage";
        Logger.d(this.f29075b, "GCSUploadImage object created, Image path=" + str + ", hash=" + str2 + ", params =" + bVar.toString());
    }

    @Override // com.safedk.android.a.g
    public g.a a() {
        try {
            if (this.f29076f == null) {
                Logger.d(this.f29075b, "Image file to upload is null");
                return null;
            }
            File file = new File(this.f29076f);
            if (!file.exists()) {
                Logger.d(this.f29075b, "Image file to upload not found " + this.f29076f);
                return null;
            }
            String d = this.f29065a.d();
            Logger.d(this.f29075b, "About to upload image to " + d + ", prefix=" + this.f29065a.a() + ", Image path: " + this.f29076f);
            Bundle c2 = this.f29065a.c();
            com.safedk.android.utils.k.b(this.f29075b, "Uploading image with headers: " + c2);
            HashMap hashMap = new HashMap();
            for (String str : c2.keySet()) {
                Logger.d(this.f29075b, "adding field key: " + str + " with value: " + c2.getString(str));
                hashMap.put(str, c2.getString(str));
            }
            d dVar = new d(g.d, d, "UTF-8", this.e, hashMap);
            dVar.a(ShareInternalUtility.STAGING_PARAM, file, false);
            dVar.a();
            String str2 = this.f29065a.a() + this.f29065a.b();
            Logger.d(this.f29075b, "Image uploaded successfully to GCS");
            return new g.a(str2, dVar.b(), this.f29077g);
        } catch (IOException e) {
            Logger.d(this.f29075b, "IOException when uploading image file " + this.f29076f + " : " + e.getMessage(), e);
            return null;
        } catch (Throwable th) {
            Logger.e(this.f29075b, "Failed to upload image file " + this.f29076f + " : " + th.getMessage(), th);
            return null;
        }
    }
}
