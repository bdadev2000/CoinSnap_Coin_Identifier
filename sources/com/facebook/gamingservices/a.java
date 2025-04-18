package com.facebook.gamingservices;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.internal.ResultProcessor;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements CallbackManagerImpl.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FacebookDialogBase f28575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ResultProcessor f28576c;

    public /* synthetic */ a(FacebookDialogBase facebookDialogBase, ResultProcessor resultProcessor, int i2) {
        this.f28574a = i2;
        this.f28575b = facebookDialogBase;
        this.f28576c = resultProcessor;
    }

    @Override // com.facebook.internal.CallbackManagerImpl.Callback
    public final boolean onActivityResult(int i2, Intent intent) {
        boolean m505registerCallbackImpl$lambda4;
        int i3 = this.f28574a;
        ResultProcessor resultProcessor = this.f28576c;
        FacebookDialogBase facebookDialogBase = this.f28575b;
        switch (i3) {
            case 0:
                m505registerCallbackImpl$lambda4 = ContextChooseDialog.m505registerCallbackImpl$lambda4((ContextChooseDialog) facebookDialogBase, (ContextChooseDialog$registerCallbackImpl$resultProcessor$1) resultProcessor, i2, intent);
                return m505registerCallbackImpl$lambda4;
            case 1:
                return ContextCreateDialog.a((ContextCreateDialog) facebookDialogBase, resultProcessor, i2, intent);
            case 2:
                return ContextSwitchDialog.a((ContextSwitchDialog) facebookDialogBase, resultProcessor, i2, intent);
            case 3:
                return TournamentJoinDialog.a((TournamentJoinDialog) facebookDialogBase, resultProcessor, i2, intent);
            default:
                return TournamentShareDialog.a((TournamentShareDialog) facebookDialogBase, resultProcessor, i2, intent);
        }
    }
}
