/**
 * Obfuscator: Binsecure  Decompiler: FernFlower
 * De-obfuscated by Gopro336
 */
package dev.nuker.pyro.launcher;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(
   mv = {1, 1, 15},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"},
   d2 = {"<anonymous>", "", "it", "Ljava/awt/event/ItemEvent;", "kotlin.jvm.PlatformType", "itemStateChanged", "dev/nuker/pyro/launcher/LoaderGui$getDownloadPanel$1$1$2", "dev/nuker/pyro/launcher/LoaderGui$$special$$inlined$apply$lambda$5"}
)
final class LoaderGui$getDownloadPanel$$inlined$apply$lambda$1 implements ItemListener {
   // $FF: synthetic field
   final JComboBox $channelBox$inlined;
   // $FF: synthetic field
   final JComboBox $versionBox$inlined;
   // $FF: synthetic field
   final JButton $button$inlined;
   // $FF: synthetic field
   final Map $versionmap$inlined;
   // $FF: synthetic field
   final Function0 $stopCallback$inlined;
   // $FF: synthetic field
   final Function2 $selectCallback$inlined;

   LoaderGui$getDownloadPanel$$inlined$apply$lambda$1(JComboBox var1, JComboBox var2, JButton var3, Map var4, Function0 var5, Function2 var6) {
      this.$channelBox$inlined = var1;
      this.$versionBox$inlined = var2;
      this.$button$inlined = var3;
      this.$versionmap$inlined = var4;
      this.$stopCallback$inlined = var5;
      this.$selectCallback$inlined = var6;
   }

   public final void itemStateChanged(ItemEvent it) {
      this.$versionBox$inlined.removeAllItems();
      Map var2 = this.$versionmap$inlined;
      Object var3 = this.$channelBox$inlined.getSelectedItem();
      boolean var4 = false;
      Object var10000 = var2.get(var3);
      if (var10000 == null) {
         Intrinsics.throwNpe();
      }

      Object[] $this$forEach$iv = (Object[])var10000;
      int $i$f$forEach = false;
      Object[] var12 = $this$forEach$iv;
      int var5 = $this$forEach$iv.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         Object element$iv = var12[var6];
         String it = (String)element$iv;
         int var9 = false;
         this.$versionBox$inlined.addItem(it);
      }

   }
}
