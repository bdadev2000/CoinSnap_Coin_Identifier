package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class DefaultEmojiCompatConfig {

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class DefaultEmojiCompatConfigFactory {

        /* renamed from: a, reason: collision with root package name */
        public final DefaultEmojiCompatConfigHelper f19500a;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public DefaultEmojiCompatConfigFactory() {
            this.f19500a = Build.VERSION.SDK_INT >= 28 ? new Object() : new Object();
        }
    }

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class DefaultEmojiCompatConfigHelper {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List c(PackageManager packageManager, Intent intent) {
            return Collections.emptyList();
        }
    }

    @RequiresApi
    @RestrictTo
    /* loaded from: classes2.dex */
    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public final ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public final List c(PackageManager packageManager, Intent intent) {
            return packageManager.queryIntentContentProviders(intent, 0);
        }
    }

    @RequiresApi
    @RestrictTo
    /* loaded from: classes2.dex */
    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public final Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.emoji2.text.EmojiCompat$Config, androidx.emoji2.text.FontRequestEmojiCompatConfig] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.emoji2.text.FontRequestEmojiCompatConfig a(android.content.Context r8) {
        /*
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory
            r0.<init>()
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            androidx.core.util.Preconditions.d(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r0 = r0.f19500a
            java.util.List r2 = r0.c(r1, r2)
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r0.a(r3)
            if (r3 == 0) goto L1f
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L1f
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L1f
            goto L3e
        L3d:
            r3 = r4
        L3e:
            if (r3 != 0) goto L42
        L40:
            r1 = r4
            goto L72
        L42:
            java.lang.String r2 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            android.content.pm.Signature[] r0 = r0.b(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            int r5 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            r6 = 0
        L51:
            if (r6 >= r5) goto L5f
            r7 = r0[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            int r6 = r6 + 1
            goto L51
        L5f:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            androidx.core.provider.FontRequest r1 = new androidx.core.provider.FontRequest     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            java.lang.String r5 = "emojicompat-emoji-font"
            r1.<init>(r2, r3, r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6b
            goto L72
        L6b:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L40
        L72:
            if (r1 != 0) goto L75
            goto L7f
        L75:
            androidx.emoji2.text.FontRequestEmojiCompatConfig r4 = new androidx.emoji2.text.FontRequestEmojiCompatConfig
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader
            r0.<init>(r8, r1)
            r4.<init>(r0)
        L7f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.DefaultEmojiCompatConfig.a(android.content.Context):androidx.emoji2.text.FontRequestEmojiCompatConfig");
    }
}
