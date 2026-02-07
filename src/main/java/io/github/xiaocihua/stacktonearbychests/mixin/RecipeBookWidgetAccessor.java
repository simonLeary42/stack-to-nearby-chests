package io.github.xiaocihua.stacktonearbychests.mixin;

import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.recipebook.RecipeBookComponent;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RecipeBookComponent.class)
public interface RecipeBookWidgetAccessor {

    @Accessor
    @Nullable
    EditBox getSearchBox();
}
