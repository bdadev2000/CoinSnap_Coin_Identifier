package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes4.dex */
public interface ResolutionAnchorProvider {
    ModuleDescriptor getResolutionAnchor(ModuleDescriptor moduleDescriptor);
}
