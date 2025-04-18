package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic;

import android.app.Activity;
import com.cooldev.gba.emulator.gameboy.features.in_app_review.InAppReviewManager;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f28523c;

    public /* synthetic */ a(int i2, Activity activity, Object obj) {
        this.f28521a = i2;
        this.f28522b = obj;
        this.f28523c = activity;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i2 = this.f28521a;
        Activity activity = this.f28523c;
        Object obj = this.f28522b;
        switch (i2) {
            case 0:
                RatingDialogViewModel.b((ReviewManager) obj, activity, task);
                return;
            case 1:
                OnboardingViewModel.b((ReviewManager) obj, activity, task);
                return;
            default:
                InAppReviewManager.b((InAppReviewManager) obj, activity, task);
                return;
        }
    }
}
