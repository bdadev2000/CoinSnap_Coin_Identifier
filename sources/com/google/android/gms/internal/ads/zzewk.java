package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzewk implements zzevz {
    private final zzges zza;
    private final Context zzb;

    public zzewk(zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
        this.zzb = context;
    }

    @Nullable
    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzewk.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(2:4|2)|5|6|(3:63|64|(19:66|67|9|10|11|(13:13|14|(1:16)(2:46|(3:49|(3:52|(2:55|56)(1:54)|50)|57))|17|18|(2:20|(7:22|23|(5:25|26|27|(1:31)|42)(1:44)|(1:33)(1:40)|(1:35)(1:39)|36|37))|45|23|(0)(0)|(0)(0)|(0)(0)|36|37)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37))|8|9|10|11|(0)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b2, blocks: (B:11:0x008f, B:13:0x009b), top: B:10:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzewi zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewk.zzc():com.google.android.gms.internal.ads.zzewi");
    }
}
