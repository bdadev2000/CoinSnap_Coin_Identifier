package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FontProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18623a = new Object();

    /* loaded from: classes.dex */
    public interface ContentQueryWrapper {
    }

    /* loaded from: classes.dex */
    public static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f18624a;

        public ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.f18624a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.provider.FontsContractCompat.FontFamilyResult a(android.content.Context r21, androidx.core.provider.FontRequest r22) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontProvider.a(android.content.Context, androidx.core.provider.FontRequest):androidx.core.provider.FontsContractCompat$FontFamilyResult");
    }
}
