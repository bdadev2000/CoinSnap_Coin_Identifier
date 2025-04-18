package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes4.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Annotations EMPTY = new Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
            public Void findAnnotation(FqName fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean hasAnnotation(FqName fqName) {
                return Annotations.DefaultImpls.hasAnnotation(this, fqName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<AnnotationDescriptor> iterator() {
                return CollectionsKt.emptyList().iterator();
            }

            public String toString() {
                return "EMPTY";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* renamed from: findAnnotation, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ AnnotationDescriptor mo1418findAnnotation(FqName fqName) {
                return (AnnotationDescriptor) findAnnotation(fqName);
            }
        };

        private Companion() {
        }

        public final Annotations create(List<? extends AnnotationDescriptor> annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            if (annotations.isEmpty()) {
                return EMPTY;
            }
            return new AnnotationsImpl(annotations);
        }

        public final Annotations getEMPTY() {
            return EMPTY;
        }
    }

    @SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n288#2,2:124\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n*L\n29#1:124,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static AnnotationDescriptor findAnnotation(Annotations annotations, FqName fqName) {
            AnnotationDescriptor annotationDescriptor;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (it.hasNext()) {
                    annotationDescriptor = it.next();
                    if (Intrinsics.areEqual(annotationDescriptor.getFqName(), fqName)) {
                        break;
                    }
                } else {
                    annotationDescriptor = null;
                    break;
                }
            }
            return annotationDescriptor;
        }

        public static boolean hasAnnotation(Annotations annotations, FqName fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (annotations.mo1418findAnnotation(fqName) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: findAnnotation */
    AnnotationDescriptor mo1418findAnnotation(FqName fqName);

    boolean hasAnnotation(FqName fqName);

    boolean isEmpty();
}
