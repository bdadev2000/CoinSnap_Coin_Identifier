package com.safedk.android.a;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.a.g;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.utils.Logger;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class a extends g {

    /* renamed from: a, reason: collision with root package name */
    k.a f29060a;

    public a(String str, String str2, int i2, k.a aVar) {
        super(str, str2, i2);
        this.f29060a = aVar;
        this.f29075b = "AwsS3UploadImage";
        Logger.d(this.f29075b, "AwsS3UploadImage object created, Image path=" + str + ", hash=" + str2 + ", params =" + aVar.toString());
    }

    @Override // com.safedk.android.a.g
    public g.a a() {
        g.a aVar;
        if (this.f29076f == null) {
            Logger.d(this.f29075b, "Image file to upload is null");
            return null;
        }
        try {
            String str = this.f29060a.f() + RemoteSettings.FORWARD_SLASH_STRING;
            Logger.d(this.f29075b, "About to upload image to " + str + ", prefix=" + this.f29060a.d() + ",Image path: " + this.f29076f);
            d dVar = new d(g.f29074c, str, "UTF-8", this.e, new HashMap());
            File file = new File(this.f29076f);
            if (!file.exists()) {
                Logger.d(this.f29075b, "Image file to upload not found " + this.f29076f);
                aVar = null;
            } else {
                dVar.a(SDKConstants.PARAM_KEY, this.f29060a.d() + RemoteSettings.FORWARD_SLASH_STRING + this.f29077g + ".jpg");
                dVar.a("AWSAccessKeyId", this.f29060a.a());
                dVar.a("acl", this.f29060a.g());
                dVar.a("Content-Type", "image/jpeg");
                dVar.a("policy", this.f29060a.b());
                dVar.a("signature", this.f29060a.c());
                dVar.a("x-amz-server-side-encryption", this.f29060a.j());
                dVar.a("X-Amz-Credential", this.f29060a.k());
                dVar.a("X-Amz-Algorithm", this.f29060a.h());
                dVar.a("X-Amz-Date", this.f29060a.i());
                dVar.a(ShareInternalUtility.STAGING_PARAM, file, true);
                dVar.a();
                String str2 = this.f29060a.f() + RemoteSettings.FORWARD_SLASH_STRING + this.f29060a.d() + RemoteSettings.FORWARD_SLASH_STRING + this.f29077g + ".jpg";
                Logger.d(this.f29075b, "Image uploaded successfully to AWS");
                aVar = new g.a(str2, dVar.b(), this.f29077g);
            }
            return aVar;
        } catch (IOException e) {
            Logger.d(this.f29075b, "IOException when uploading image file " + this.f29076f + " : " + e.getMessage(), e);
            return null;
        } catch (Throwable th) {
            Logger.e(this.f29075b, "Failed to upload image file " + this.f29076f + " : " + th.getMessage(), th);
            return null;
        }
    }
}
