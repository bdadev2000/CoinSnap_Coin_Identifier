package com.facebook.gamingservices;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.bolts.TaskCompletionSource;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements GraphRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28578b;

    public /* synthetic */ b(TaskCompletionSource taskCompletionSource, int i2) {
        this.f28577a = i2;
        this.f28578b = taskCompletionSource;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i2 = this.f28577a;
        TaskCompletionSource taskCompletionSource = this.f28578b;
        switch (i2) {
            case 0:
                TournamentFetcher.a(taskCompletionSource, graphResponse);
                return;
            default:
                TournamentUpdater.a(taskCompletionSource, graphResponse);
                return;
        }
    }
}
