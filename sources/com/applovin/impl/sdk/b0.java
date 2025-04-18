package com.applovin.impl.sdk;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.view.InputEvent;
import android.widget.EditText;
import com.google.android.material.search.SearchBar;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b0 {
    public static /* bridge */ /* synthetic */ GetTopicsRequest.Builder b(GetTopicsRequest.Builder builder) {
        return builder.setAdsSdkName("AppLovin");
    }

    public static /* bridge */ /* synthetic */ void d(MeasurementManager measurementManager, Uri uri, InputEvent inputEvent, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, inputEvent, executor, outcomeReceiver);
    }

    public static /* bridge */ /* synthetic */ void e(MeasurementManager measurementManager, Uri uri, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, null, executor, outcomeReceiver);
    }

    public static /* bridge */ /* synthetic */ void f(TopicsManager topicsManager, GetTopicsRequest getTopicsRequest, Executor executor, OutcomeReceiver outcomeReceiver) {
        topicsManager.getTopics(getTopicsRequest, executor, outcomeReceiver);
    }

    public static /* bridge */ /* synthetic */ void i(EditText editText) {
        editText.setIsHandwritingDelegate(true);
    }

    public static /* bridge */ /* synthetic */ void j(SearchBar searchBar, float f2, float f3) {
        searchBar.setHandwritingBoundsOffsets(f2, 0.0f, f3, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void k(SearchBar searchBar, com.google.android.material.search.k kVar) {
        searchBar.setHandwritingDelegatorCallback(kVar);
    }

    public static /* bridge */ /* synthetic */ void m(MeasurementManager measurementManager, Uri uri, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerTrigger(uri, executor, outcomeReceiver);
    }
}
