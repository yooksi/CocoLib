/*
 *  Copyright (C) 2020 Matthew Cain
 *
 *  This file is part of CocoLib.
 *
 *  CocoLib is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CocoLib. If not, see <https://www.gnu.org/licenses/>.
 */
package io.yooksi.cocolib;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import javax.annotation.meta.TypeQualifierNickname;
import java.lang.annotation.*;

/**
 * Extends JSR-305's nullability annotations that asserts that all fields,
 * return values, and parameters are not null by default.
 *
 * @author phantamanta44
 * @see <a href="https://github.com/phantamanta44/jsr305">JSR-305 on Github</a>
 */
@Documented
@TypeQualifierNickname
@TypeQualifierDefault({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Nonnull
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.CLASS)
public @interface NothingNull {}