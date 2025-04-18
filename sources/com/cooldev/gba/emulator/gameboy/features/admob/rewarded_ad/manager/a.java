package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import com.cooldev.gba.emulator.gameboy.features.in_app_update.InAppUpdateManager;
import com.facebook.login.LoginFragment;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.OnSuccessListener;
import q0.l;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements OnUserEarnedRewardListener, ActivityResultCallback, OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f28516b;

    public /* synthetic */ a(l lVar) {
        this.f28516b = lVar;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        LoginFragment.h(this.f28516b, (ActivityResult) obj);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        InAppUpdateManager.b(obj, this.f28516b);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        RewardedAdManager.a(this.f28516b, rewardItem);
    }
}
