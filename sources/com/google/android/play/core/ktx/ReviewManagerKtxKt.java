package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.annotation.NonNull;
import b1.f0;
import b1.k;
import b1.l;
import com.google.android.gms.common.annotation.NoNullnessRewrite;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import d0.b0;
import d1.h;
import d1.s;
import h0.g;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public final class ReviewManagerKtxKt {
    @Nullable
    public static final Object launchReview(@NotNull ReviewManager reviewManager, @NotNull Activity activity, @NotNull ReviewInfo reviewInfo, @NotNull g gVar) {
        Task<Void> launchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
        a.r(launchReviewFlow, "launchReviewFlow(...)");
        Object runTask$default = runTask$default(launchReviewFlow, null, gVar, 2, null);
        return runTask$default == i0.a.f30806a ? runTask$default : b0.f30125a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object requestReview(@org.jetbrains.annotations.NotNull com.google.android.play.core.review.ReviewManager r4, @org.jetbrains.annotations.NotNull h0.g r5) {
        /*
            boolean r0 = r5 instanceof com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1
            if (r0 == 0) goto L13
            r0 = r5
            com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 r0 = (com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1 r0 = new com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.jvm.internal.q.m(r5)
            com.google.android.gms.tasks.Task r4 = r4.requestReviewFlow()
            java.lang.String r5 = "requestReviewFlow(...)"
            p0.a.r(r4, r5)
            r0.label = r3
            r5 = 0
            r2 = 2
            java.lang.Object r5 = runTask$default(r4, r5, r0, r2, r5)
            if (r5 != r1) goto L46
            return r1
        L46:
            p0.a.p(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.ReviewManagerKtxKt.requestReview(com.google.android.play.core.review.ReviewManager, h0.g):java.lang.Object");
    }

    @Nullable
    public static final <T> Object runTask(@NotNull Task<T> task, @NotNull q0.a aVar, @NotNull g gVar) {
        final l lVar = new l(1, f0.r(gVar));
        lVar.p();
        lVar.z(new ReviewManagerKtxKt$runTask$3$1(aVar));
        if (!task.isComplete()) {
            final ReviewManagerKtxKt$runTask$3$2 reviewManagerKtxKt$runTask$3$2 = new ReviewManagerKtxKt$runTask$3$2(lVar);
            task.addOnSuccessListener(new OnSuccessListener(reviewManagerKtxKt$runTask$3$2) { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
                private final /* synthetic */ q0.l function;

                {
                    a.s(reviewManagerKtxKt$runTask$3$2, "function");
                    this.function = reviewManagerKtxKt$runTask$3$2;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(@NoNullnessRewrite(reason = "Can be null for Task<Void> but this is uncommon.") Object obj) {
                    this.function.invoke(obj);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    a.s(exc, "exception");
                    k.this.resumeWith(q.d(exc));
                }
            });
        } else if (task.isSuccessful()) {
            lVar.resumeWith(task.getResult());
        } else {
            Exception exception = task.getException();
            a.p(exception);
            lVar.resumeWith(q.d(exception));
        }
        Object o2 = lVar.o();
        i0.a aVar2 = i0.a.f30806a;
        return o2;
    }

    public static /* synthetic */ Object runTask$default(Task task, q0.a aVar, g gVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = ReviewManagerKtxKt$runTask$2.INSTANCE;
        }
        return runTask(task, aVar, gVar);
    }

    public static final <E> boolean tryOffer(@NotNull s sVar, @NonNull E e) {
        a.s(sVar, "<this>");
        return !(sVar.b(e) instanceof h);
    }
}
