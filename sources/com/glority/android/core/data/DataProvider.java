package com.glority.android.core.data;

import androidx.collection.ArrayMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.data.DataProvider;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataProvider.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u0013*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013J\b\u0010\f\u001a\u00020\rH\u0016J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R \u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/glority/android/core/data/DataProvider;", ExifInterface.GPS_DIRECTION_TRUE, "", "consumerList", "", "Lcom/glority/android/core/data/DataConsumer;", "getConsumerList", "()Ljava/util/List;", "subject", "Lio/reactivex/subjects/PublishSubject;", "getSubject", "()Lio/reactivex/subjects/PublishSubject;", "destroyProvider", "", "provide", "data", "(Ljava/lang/Object;)V", "subscribe", "consumer", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public interface DataProvider<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void destroyProvider();

    List<DataConsumer<Object>> getConsumerList();

    PublishSubject<Object> getSubject();

    void provide(T data);

    void subscribe(Object consumer);

    /* compiled from: DataProvider.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: subscribe$lambda-2, reason: not valid java name */
        public static final void m7738subscribe$lambda2(Throwable th) {
        }

        public static <T> PublishSubject<Object> getSubject(DataProvider<T> dataProvider) {
            PublishSubject<Object> publishSubject;
            Intrinsics.checkNotNullParameter(dataProvider, "this");
            synchronized (dataProvider) {
                publishSubject = DataProvider.INSTANCE.getSubjects().get(dataProvider);
                if (publishSubject == null) {
                    publishSubject = PublishSubject.create();
                    Intrinsics.checkNotNullExpressionValue(publishSubject, "create<Any>()");
                }
                DataProvider.INSTANCE.getSubjects().put(dataProvider, publishSubject);
            }
            return publishSubject;
        }

        public static <T> List<DataConsumer<Object>> getConsumerList(DataProvider<T> dataProvider) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(dataProvider, "this");
            synchronized (dataProvider) {
                arrayList = DataProvider.INSTANCE.getConsumers().get(dataProvider);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                DataProvider.INSTANCE.getConsumers().put(dataProvider, arrayList);
            }
            return arrayList;
        }

        public static <T> void subscribe(DataProvider<T> dataProvider, Object consumer) {
            Intrinsics.checkNotNullParameter(dataProvider, "this");
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            if (consumer instanceof DataConsumer) {
                DataConsumer<Object> dataConsumer = (DataConsumer) consumer;
                dataProvider.getConsumerList().add(dataConsumer);
                Disposable d = dataProvider.getSubject().subscribe((Consumer) consumer, new Consumer() { // from class: com.glority.android.core.data.DataProvider$DefaultImpls$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        DataProvider.DefaultImpls.m7738subscribe$lambda2((Throwable) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(d, "d");
                dataConsumer.bind(dataProvider, d);
            }
        }

        public static <T> void provide(DataProvider<T> dataProvider, T t) {
            Intrinsics.checkNotNullParameter(dataProvider, "this");
            PublishSubject<Object> publishSubject = DataProvider.INSTANCE.getSubjects().get(dataProvider);
            if (publishSubject == null) {
                return;
            }
            if (t == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            publishSubject.onNext(t);
        }

        public static <T> void destroyProvider(DataProvider<T> dataProvider) {
            Intrinsics.checkNotNullParameter(dataProvider, "this");
            PublishSubject<Object> publishSubject = DataProvider.INSTANCE.getSubjects().get(dataProvider);
            if (publishSubject != null) {
                publishSubject.onComplete();
                DataProvider.INSTANCE.getSubjects().remove(dataProvider);
            }
            List<DataConsumer<Object>> list = DataProvider.INSTANCE.getConsumers().get(dataProvider);
            if (list != null) {
                Iterator<DataConsumer<Object>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onComplete(dataProvider);
                }
                list.clear();
                DataProvider.INSTANCE.getConsumers().remove(dataProvider);
            }
        }
    }

    /* compiled from: DataProvider.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R/\u0010\u0003\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR)\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/glority/android/core/data/DataProvider$Companion;", "", "()V", "consumers", "Landroidx/collection/ArrayMap;", "Lcom/glority/android/core/data/DataProvider;", "", "Lcom/glority/android/core/data/DataConsumer;", "getConsumers", "()Landroidx/collection/ArrayMap;", "subjects", "Lio/reactivex/subjects/PublishSubject;", "getSubjects", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ArrayMap<DataProvider<Object>, PublishSubject<Object>> subjects = new ArrayMap<>();
        private static final ArrayMap<DataProvider<Object>, List<DataConsumer<Object>>> consumers = new ArrayMap<>();

        private Companion() {
        }

        public final ArrayMap<DataProvider<Object>, PublishSubject<Object>> getSubjects() {
            return subjects;
        }

        public final ArrayMap<DataProvider<Object>, List<DataConsumer<Object>>> getConsumers() {
            return consumers;
        }
    }
}
