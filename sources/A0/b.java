package A0;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.view.InputEvent;
import e8.C2241p;
import e8.C2242q;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ Class A() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void B() {
    }

    public static /* bridge */ /* synthetic */ void C(MeasurementManager measurementManager, Uri uri, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerTrigger(uri, executor, outcomeReceiver);
    }

    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ int a(Topic topic) {
        return topic.getTopicId();
    }

    public static /* bridge */ /* synthetic */ long b(Topic topic) {
        return topic.getTaxonomyVersion();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder d() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsRequest.Builder e(GetTopicsRequest.Builder builder) {
        return builder.setAdsSdkName("AppLovin");
    }

    public static /* bridge */ /* synthetic */ GetTopicsRequest.Builder g(GetTopicsRequest.Builder builder, boolean z8) {
        return builder.setShouldRecordObservation(z8);
    }

    public static /* bridge */ /* synthetic */ GetTopicsRequest h(GetTopicsRequest.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse i(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic j(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager k(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ Object n(C2241p c2241p, Class cls) {
        return c2241p.get(cls);
    }

    public static /* bridge */ /* synthetic */ Object o(C2242q c2242q, Class cls) {
        return c2242q.get(cls);
    }

    public static /* bridge */ /* synthetic */ List p(GetTopicsResponse getTopicsResponse) {
        return getTopicsResponse.getTopics();
    }

    public static /* synthetic */ void q() {
        new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ void u(MeasurementManager measurementManager, Uri uri, InputEvent inputEvent, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, inputEvent, executor, outcomeReceiver);
    }

    public static /* bridge */ /* synthetic */ void v(MeasurementManager measurementManager, Uri uri, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, null, executor, outcomeReceiver);
    }

    public static /* bridge */ /* synthetic */ void x(TopicsManager topicsManager, GetTopicsRequest getTopicsRequest, Executor executor, OutcomeReceiver outcomeReceiver) {
        topicsManager.getTopics(getTopicsRequest, executor, outcomeReceiver);
    }

    public static /* bridge */ /* synthetic */ long z(Topic topic) {
        return topic.getModelVersion();
    }
}
